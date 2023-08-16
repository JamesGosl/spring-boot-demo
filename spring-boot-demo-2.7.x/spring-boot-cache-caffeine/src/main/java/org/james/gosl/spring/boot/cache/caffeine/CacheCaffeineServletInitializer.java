package org.james.gosl.spring.boot.cache.caffeine;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Servlet 容器中进行初始化
 *
 * @author James Gosl
 * @since 2023/08/16 13:40
 */
public class CacheCaffeineServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(CacheCaffeineApplication.class);
    }
}
