package org.james.gosl.spring.boot.hibernate.validation.domain.vo.req;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * IdReq
 *
 * @author James Gosl
 * @since 2023/08/15 18:43
 */
@Data
public class IdReq {

    @NotNull
    private Long id;
}
