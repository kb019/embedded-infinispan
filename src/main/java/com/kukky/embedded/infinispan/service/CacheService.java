package com.kukky.embedded.infinispan.service;

import jakarta.annotation.PostConstruct;
import org.infinispan.Cache;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.stereotype.Service;


@Service
public class CacheService {

    private final EmbeddedCacheManager cacheManager;
    private Cache<String, String> cache;

    public CacheService(EmbeddedCacheManager cacheManager) {
        this.cacheManager = cacheManager;
    }

    @PostConstruct
    public void init() {
        // Get or create a cache named "myCache"
        this.cache = cacheManager.getCache("myCache", true);
    }

    public void put(String key, String value) {
        cache.put(key, value);
    }

    public String get(String key) {
        return cache.get(key);
    }
}
