package org.james.gosl.spring.boot.data.redis.service.cache;

import lombok.extern.slf4j.Slf4j;
import org.james.gosl.spring.boot.data.redis.common.constant.RedisKey;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * HelloCache
 *
 * @author James Gosl
 * @since 2023/08/18 11:51
 */
@Component
@Slf4j
public class HelloCache {
    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public String getString(Long key) {
        String val = (String) redisTemplate.opsForValue().get(RedisKey.getKey(RedisKey.HELLO_STRING, key));

        if(val == null) {
            log.debug("缓存未击中-{}", key);
            // 数据库查询
            val = "Hello World " + key;
            redisTemplate.opsForValue().set(RedisKey.getKey(RedisKey.HELLO_STRING, key), val);
        }
        return val;
    }
}
