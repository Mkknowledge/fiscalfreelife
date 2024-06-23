package com.fiscalfreelife.fiscal_roboticuw_api.service.impl;

import com.fiscalfreelife.fiscal_roboticuw_api.application.dto.*;
import com.fiscalfreelife.fiscal_roboticuw_api.service.RoboticUWService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@Slf4j
@Service
public class RoboticUWServiceImpl implements RoboticUWService {
    @Override
    public CoverageResponse getCoverageOffering(Coverage coverage) {
        List<Coverages> coverages = Collections.singletonList(Coverages.builder().code("")
                .loading(Collections.singletonList(Loading.builder().build()))
                .sumAssured(new BigDecimal("1000"))
                .build());

        List<Offerings> offerings = Collections.singletonList(Offerings.builder().paymentFrequency("Monthly")
                .policyTerm("40")
                .coverages(coverages)
                .productCode("P1")
                .premiumPayingTerm("40")
                .build());
        return CoverageResponse.builder().offerings(offerings).build();
    }
}
