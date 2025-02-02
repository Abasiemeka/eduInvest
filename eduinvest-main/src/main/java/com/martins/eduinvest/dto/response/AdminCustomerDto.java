package com.martins.eduinvest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminCustomerDto {

    private Integer totalCustomers;
    private Integer activeCustomers;
    private Integer inactiveCustomers;
    private Integer blockedCustomers;
    private Integer totalLiens;
    private Integer numberOfChildren;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private boolean status;
}
