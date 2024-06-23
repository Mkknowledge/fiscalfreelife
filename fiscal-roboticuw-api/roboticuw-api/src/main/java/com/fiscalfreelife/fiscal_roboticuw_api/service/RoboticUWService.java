package com.fiscalfreelife.fiscal_roboticuw_api.service;

import com.fiscalfreelife.fiscal_roboticuw_api.application.dto.Coverage;
import com.fiscalfreelife.fiscal_roboticuw_api.application.dto.CoverageResponse;
import com.fiscalfreelife.fiscal_roboticuw_api.application.dto.Coverages;

public interface RoboticUWService {

    CoverageResponse getCoverageOffering(Coverage coverage);
}
