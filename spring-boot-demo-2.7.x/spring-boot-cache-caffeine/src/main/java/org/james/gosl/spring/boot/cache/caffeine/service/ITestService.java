package org.james.gosl.spring.boot.cache.caffeine.service;

import java.util.List;

/**
 * ITestService
 *
 * @author James Gosl
 * @since 2023/08/16 13:48
 */
public interface ITestService {

    String getStr(int i);

    void setStr(int i);

    List<String> getStrs();
}
