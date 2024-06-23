package com.fiscalfreelife.fiscal_roboticuw_api.application.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoverageResponse {

    private List<Offerings> offerings;
}
