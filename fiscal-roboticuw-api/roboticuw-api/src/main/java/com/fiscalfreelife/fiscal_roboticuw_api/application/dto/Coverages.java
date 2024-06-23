package com.fiscalfreelife.fiscal_roboticuw_api.application.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coverages {

    private String code;
    private BigDecimal sumAssured;
    private List<Loading> loading;
}
