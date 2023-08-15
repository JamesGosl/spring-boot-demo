package org.james.gosl.spring.boot.hibernate.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * HibernateValidation Application
 *
 * @author James Gosl
 * @since 2023/08/15 18:40
 */
@SpringBootApplication
public class HibernateValidationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                new SpringApplication(HibernateValidationApplication.class).run(args);
    }
}
