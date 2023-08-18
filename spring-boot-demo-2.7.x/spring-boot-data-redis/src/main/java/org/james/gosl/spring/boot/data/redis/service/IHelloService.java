package org.james.gosl.spring.boot.data.redis.service;

/**
 * IHelloService
 *
 * @author James Gosl
 * @since 2023/08/18 11:49
 */
public interface IHelloService {

    String getString(Long key);
}
