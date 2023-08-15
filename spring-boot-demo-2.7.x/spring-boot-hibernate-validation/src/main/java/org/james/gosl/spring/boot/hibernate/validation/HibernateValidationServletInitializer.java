package org.james.gosl.spring.boot.hibernate.validation;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Servlet 容器中进行初始化
 *
 * @author James Gosl
 * @since 2023/08/15 18:40
 */
public class HibernateValidationServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HibernateValidationApplication.class);
    }
}
