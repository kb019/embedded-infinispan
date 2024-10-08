package com.kukky.embedded.infinispan.testcode;


import com.kukky.embedded.infinispan.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {

    @Autowired
    CacheService cacheService;

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationReady() {
        cacheService.put("123","123");
        System.out.println(cacheService.get("123"));
    }

}
