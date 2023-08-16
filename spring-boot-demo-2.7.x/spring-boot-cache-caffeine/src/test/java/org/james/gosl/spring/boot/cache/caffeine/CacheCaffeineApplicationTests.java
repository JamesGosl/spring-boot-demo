package org.james.gosl.spring.boot.cache.caffeine;

import lombok.extern.slf4j.Slf4j;
import org.james.gosl.spring.boot.cache.caffeine.service.ITestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;

@SpringBootTest(classes = CacheCaffeineApplication.class)
@Slf4j
public class CacheCaffeineApplicationTests {

    @Autowired
    private ITestService testService;

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void testCache() {
        testService.getStrs();
        log.debug("-----------------完美分割线-----------------");
        testService.getStr(1);
        log.debug("-----------------完美分割线-----------------");
        testService.setStr(1);
        log.debug("-----------------完美分割线-----------------");
        testService.getStr(1);
    }

    @Test
    public void threadLocal() {
        for (int i = 0; i < 10; i++) {
            new Thread(()-> {
                System.out.println(testService.getStr(1));
            }).start();
        }

        while (Thread.activeCount() > 1) {

        }
    }
}