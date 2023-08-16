package org.james.gosl.spring.boot.hibernate.validation.common.exception;

import lombok.extern.slf4j.Slf4j;
import org.james.gosl.spring.boot.hibernate.validation.domain.vo.resp.ApiResult;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 *
 * @author James Gosl
 * @since 2023/08/15 17:42
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * validation参数校验异常
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ApiResult<Void> methodArgumentNotValidExceptionExceptionHandler(MethodArgumentNotValidException e) {
        StringBuilder errorMsg = new StringBuilder();
        e.getBindingResult().getFieldErrors().forEach(x -> errorMsg.append(x.getField()).append(x.getDefaultMessage()).append(","));
        String message = errorMsg.toString();
        log.info("validation parameters error！The reason is:{}", message);
        return ApiResult.fail(CommonErrorEnum.PARAM_VALID.getErrorCode(), message.substring(0, message.length() - 1));
    }

    /**
     * validation参数校验异常
     */
    @ExceptionHandler(value = BindException.class)
    public ApiResult<Void> bindException(BindException e) {
        StringBuilder errorMsg = new StringBuilder();
        e.getBindingResult().getFieldErrors().forEach(x -> errorMsg.append(x.getField()).append(x.getDefaultMessage()).append(","));
        String message = errorMsg.toString();
        log.info("validation parameters error！The reason is:{}", message);
        return ApiResult.fail(CommonErrorEnum.PARAM_VALID.getErrorCode(), message.substring(0, message.length() - 1));
    }
}
