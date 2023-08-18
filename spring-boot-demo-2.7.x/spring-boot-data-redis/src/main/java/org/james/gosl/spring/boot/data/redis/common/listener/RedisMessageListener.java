package org.james.gosl.spring.boot.data.redis.common.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

/**
 * Redis 消息监听器
 *
 * @author James Gosl
 * @since 2023/08/18 12:23
 */
@Slf4j
public class RedisMessageListener implements MessageListener {
    public final static String SUBSCRIBE_LISTENER_PATTERN = "delete.*";

    @Override
    public void onMessage(Message message, byte[] pattern) {
        String patter = new String(pattern);
        String channel = new String(message.getChannel());
        String body = new String(message.getBody());
        log.debug("匹配[{}]-通道[{}]-内容[{}]", patter, channel, body);
    }
}
