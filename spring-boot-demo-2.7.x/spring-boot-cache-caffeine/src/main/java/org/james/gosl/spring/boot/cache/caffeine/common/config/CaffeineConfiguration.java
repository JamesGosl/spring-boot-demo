package org.james.gosl.spring.boot.cache.caffeine.common.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import java.util.concurrent.TimeUnit;

/**
 * CaffeineConfiguration
 *
 * @author James Gosl
 * @since 2023/08/16 13:42
 */
@EnableCaching
@SpringBootConfiguration
public class CaffeineConfiguration {

    @Bean("caffeineCacheManager")
    @Primary
    public CacheManager caffeineCacheManager() {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        cacheManager
                // 设置核心
                .setCaffeine(Caffeine.newBuilder()
                // 删除策略：最后一次写入或访问后经过的固定时间
                .expireAfterWrite(5, TimeUnit.MINUTES)
                // 初始的缓存空间大小
                .initialCapacity(100)
                // 缓存的最大条目
                .maximumSize(200));
        return cacheManager;
    }
}
