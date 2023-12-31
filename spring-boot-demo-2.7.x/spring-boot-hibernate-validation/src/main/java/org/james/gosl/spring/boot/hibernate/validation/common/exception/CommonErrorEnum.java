package org.james.gosl.spring.boot.hibernate.validation.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 通用异常码
 *
 * @author James Gosl
 * @since 2023/08/15 17:43
 */
@AllArgsConstructor
@Getter
public enum CommonErrorEnum implements ErrorEnum {
    SYSTEM_ERROR(-1, "系统出小差了，请稍后再试哦~~"),
    PARAM_VALID(-2, "参数校验失败，你在试试别的~~"),
    ;

    private final Integer code;
    private final String msg;

    @Override
    public Integer getErrorCode() {
        return this.code;
    }

    @Override
    public String getErrorMsg() {
        return this.msg;
    }
}
