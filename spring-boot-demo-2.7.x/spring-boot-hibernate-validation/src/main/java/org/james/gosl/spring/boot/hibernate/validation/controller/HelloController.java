package org.james.gosl.spring.boot.hibernate.validation.controller;

import org.james.gosl.spring.boot.hibernate.validation.domain.vo.req.IdReq;
import org.james.gosl.spring.boot.hibernate.validation.domain.vo.resp.ApiResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * HelloController
 *
 * @author James Gosl
 * @since 2023/08/15 18:42
 */
@RestController
public class HelloController {

    // 如果是Get 方法的话，不要加@ReqeustBody
    @GetMapping({"", "/", "/index"})
    public ApiResult<Long> hello(@Valid IdReq req) {
        return ApiResult.success(req.getId());
    }
}
