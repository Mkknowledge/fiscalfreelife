package com.fiscalfreelife.fiscal_roboticuw_api.application.dto;

import lombok.*;

import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Offerings {

    private String productCode;
    private String policyTerm;
    private String premiumPayingTerm;
    private String paymentFrequency;
    private List<Coverages> coverages;
}
