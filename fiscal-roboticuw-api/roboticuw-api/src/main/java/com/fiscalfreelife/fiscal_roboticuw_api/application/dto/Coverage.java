package com.fiscalfreelife.fiscal_roboticuw_api.application.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coverage {

    private String mobileNumber;
    private String dateOfBirth;
    private String gender;
    private String pan;
}
