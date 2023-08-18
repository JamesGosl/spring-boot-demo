package org.james.gosl.spring.boot.data.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScans;

/**
 * DataRedisApplication
 *
 * @author James Gosl
 * @since 2023/08/18 10:58
 */
@SpringBootApplication
public class DataRedisApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new SpringApplication(DataRedisApplication.class).run(args);
    }
}
