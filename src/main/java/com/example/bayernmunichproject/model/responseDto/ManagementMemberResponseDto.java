package com.example.bayernmunichproject.model.responseDto;

import com.example.bayernmunichproject.enums.ManagementRole;
import lombok.Data;

@Data
public class ManagementMemberResponseDto {
    private Long id;
    private String name;
    private String role;
    private String email;
    private String phoneNumber;
    private String clubName;
    private ManagementRole managementRole;
}
