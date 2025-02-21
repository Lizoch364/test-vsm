package com.example.vsm.config;

import java.time.Duration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext.SerializationPair;

@Configuration
public class RedisConfiguration {
    @Value("${redis.host}")
    private String redisHost;

    @Value("${redis.port}")
    private int redisPort;

    @Value("${redis.password}")
    private String redisPassword;

    @Bean
    public LettuceConnectionFactory redisConnectionFactory() {
      RedisStandaloneConfiguration configuration = new RedisStandaloneConfiguration();
      configuration.setHostName(redisHost);
      configuration.setPort(redisPort);
      configuration.setPassword(redisPassword);
      return new LettuceConnectionFactory(configuration);
    }
    @Bean
    public RedisCacheManager cacheManager() {
      RedisCacheConfiguration cacheConfig = myDefaultCacheConfig(Duration.ofMinutes(10)).disableCachingNullValues();

      return RedisCacheManager.builder(redisConnectionFactory())
				.cacheDefaults(cacheConfig)
				.withCacheConfiguration("chapters", myDefaultCacheConfig(Duration.ofMinutes(10)))
				.withCacheConfiguration("partsParam", myDefaultCacheConfig(Duration.ofMinutes(10)))
				.withCacheConfiguration("partsNotFilial", myDefaultCacheConfig(Duration.ofMinutes(10)))
				.build();
    }

    private RedisCacheConfiguration myDefaultCacheConfig(Duration duration) {
      return RedisCacheConfiguration
				.defaultCacheConfig()
				.entryTtl(duration)
				.serializeValuesWith(SerializationPair.fromSerializer(new JdkSerializationRedisSerializer()));
    }
  }
