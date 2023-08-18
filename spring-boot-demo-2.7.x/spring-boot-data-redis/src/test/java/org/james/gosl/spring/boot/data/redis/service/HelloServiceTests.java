package org.james.gosl.spring.boot.data.redis.service;

import lombok.extern.slf4j.Slf4j;
import org.james.gosl.spring.boot.data.redis.DataRedisApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * HelloServiceTests
 *
 * @author James Gosl
 * @since 2023/08/18 12:03
 */
@SpringBootTest(classes = DataRedisApplication.class)
@Slf4j
public class HelloServiceTests {

    @Autowired
    private IHelloService helloService;

    @Test
    public void getString() {
        for (int i = 0; i < 1000; i++) {
            log.debug(helloService.getString((long) i));
        }
    }

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void messageListener() {
        // 发布者
        redisTemplate.convertAndSend("delete.key", "Hello World");
    }
}
