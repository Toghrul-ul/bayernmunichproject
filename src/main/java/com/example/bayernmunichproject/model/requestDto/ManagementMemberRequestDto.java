package com.example.bayernmunichproject.model.requestDto;

import com.example.bayernmunichproject.enums.ManagementRole;

public class ManagementMemberRequestDto {
    private String name;
    private String role;
    private String email;
    private String phoneNumber;
    private Long clubId;
    private ManagementRole managementRole;
}