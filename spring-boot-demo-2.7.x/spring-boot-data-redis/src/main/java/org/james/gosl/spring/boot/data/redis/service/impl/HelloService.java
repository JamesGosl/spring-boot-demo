package org.james.gosl.spring.boot.data.redis.service.impl;

import org.james.gosl.spring.boot.data.redis.service.IHelloService;
import org.james.gosl.spring.boot.data.redis.service.cache.HelloCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * HelloService
 *
 * @author James Gosl
 * @since 2023/08/18 11:50
 */
@Service
public class HelloService implements IHelloService {

    @Autowired
    private HelloCache helloCache;

    @Override
    public String getString(Long key) {
        return helloCache.getString(key);
    }
}
