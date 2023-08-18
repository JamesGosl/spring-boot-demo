package org.james.gosl.spring.boot.data.redis.common.constant;

/**
 * RedisKey
 *
 * @author James Gosl
 * @since 2023/08/18 11:47
 */
public class RedisKey {
    private static final String BASE_KEY = "spring-boot-data-redis:";

    public static final String HELLO_STRING = "hello:id_%d";

    public static String getKey(String key, Object... objects) {
        return BASE_KEY + String.format(key, objects);
    }
}
