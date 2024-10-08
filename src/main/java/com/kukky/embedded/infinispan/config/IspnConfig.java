package com.kukky.embedded.infinispan.config;

import org.infinispan.configuration.cache.CacheMode;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class IspnConfig {

    @Bean
    public DefaultCacheManager cacheManager() throws IOException {
        // Configure the transport to enable clustering
        return new DefaultCacheManager("infinispan.xml");
    }
}
