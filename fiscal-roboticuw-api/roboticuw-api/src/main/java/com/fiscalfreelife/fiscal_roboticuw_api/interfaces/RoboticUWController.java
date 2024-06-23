package com.fiscalfreelife.fiscal_roboticuw_api.interfaces;

import com.fiscalfreelife.fiscal_roboticuw_api.application.dto.*;
import com.fiscalfreelife.fiscal_roboticuw_api.service.RoboticUWService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Date;

import static org.springframework.util.ObjectUtils.isEmpty;

@Slf4j
@RestController
//@RequestMapping("/roboticuw")
public class RoboticUWController {

    @Autowired
    RoboticUWService roboticUWService;

    @PostMapping("/offerings")
    public ResponseEntity<CoverageResponse> getOfferingDetails(@RequestBody Coverage coverage) throws Exception {
        log.info("GetOfferings.");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = formatter.parse(coverage.getDateOfBirth());
        if (!isEmpty(coverage) && !isEmpty(coverage.getDateOfBirth()) && !coverage.getDateOfBirth().equalsIgnoreCase(formatter.format(dob))){
            throw new Exception("DateOfBirth is not in valid format");
        }
        return ResponseEntity.ok(roboticUWService.getCoverageOffering(coverage));
    }
}
