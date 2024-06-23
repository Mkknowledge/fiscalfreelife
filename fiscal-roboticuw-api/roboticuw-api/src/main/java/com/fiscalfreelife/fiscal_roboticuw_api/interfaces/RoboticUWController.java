package com.fiscalfreelife.fiscal_roboticuw_api.interfaces;

import com.fiscalfreelife.fiscal_roboticuw_api.application.dto.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/roboticuw")
public class RoboticUWController {

    @PostMapping("/offerings")
    public ResponseEntity<CoverageResponse> getOfferingDetails(@RequestBody Coverage coverage) {
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

        return ResponseEntity.ok(CoverageResponse.builder().offerings(offerings).build());
    }

}