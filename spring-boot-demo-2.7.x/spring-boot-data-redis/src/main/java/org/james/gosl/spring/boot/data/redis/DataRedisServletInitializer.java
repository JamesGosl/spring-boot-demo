package org.james.gosl.spring.boot.data.redis;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Servlet 容器中进行初始化
 *
 * @author James Gosl
 * @since 2023/08/18 10:58
 */
public class DataRedisServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DataRedisApplication.class);
    }
}
