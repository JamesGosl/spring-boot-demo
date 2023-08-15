package org.james.gosl.spring.boot.hibernate.validation.common.exception;

/**
 * 异常结构
 *
 * @author James Gosl
 * @since 2023/08/14 22:15
 */
public interface ErrorEnum {

    Integer getErrorCode();

    String getErrorMsg();
}
