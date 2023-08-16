package org.james.gosl.spring.boot.cache.caffeine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * CacheCaffeineApplication
 *
 * Caffeine 和Ehcache 在读性能上差距不打，但是在写性能上Caffeine 明显要比Ehcache 快不少。
 * 综合易用性，一般项目使用Caffeine 就足够了。
 *
 * @author James Gosl
 * @since 2023/08/16 13:39
 */
@SpringBootApplication
public class CacheCaffeineApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new SpringApplication(CacheCaffeineApplication.class).run(args);
    }
}
