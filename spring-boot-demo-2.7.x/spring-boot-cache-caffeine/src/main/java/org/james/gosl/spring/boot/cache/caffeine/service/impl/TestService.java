package org.james.gosl.spring.boot.cache.caffeine.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.james.gosl.spring.boot.cache.caffeine.common.constant.CacheKey;
import org.james.gosl.spring.boot.cache.caffeine.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * TestService
 *
 * @author James Gosl
 * @since 2023/08/16 13:48
 */
@Service
@Slf4j
public class TestService implements ITestService {

    @Autowired
    private CacheManager cacheManager;

    // ConcurrentHashMap 存储所有Cache
    // cacheNames 为Key
    // CaffenineCahce 为Val
    //  name: cacheNames
    //  cache: ThreadLocal
    @Override
    @Cacheable(cacheNames = CacheKey.TEST, key = "'str-' + #i")
    public String getStr(int i) {
        Cache cache = cacheManager.getCache(CacheKey.TEST);
        if(cache != null) {
            Cache.ValueWrapper strs = cache.get("strs");
            if(strs != null) {
                Object key = strs.get();
                if(key != null) {
                    return ((List<String>) key).get(1);
                }
            }
        }
        log.debug("未击中本地缓存");
        return "hello";
    }

    @Override
    @CacheEvict(cacheNames = CacheKey.TEST, key = "'str-' + #i")
    public void setStr(int i) {
        log.debug("清除缓存");
        // 手动清除所有缓存
        cacheManager.getCache(CacheKey.TEST).clear();
    }

    @Override
    @Cacheable(cacheNames = CacheKey.TEST, key = "'strs'")
    public List<String> getStrs() {
        log.debug("未击中本地缓存");
        return Arrays.asList("1", "2", "3");
    }
}
