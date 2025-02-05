package com.example.bayernmunichproject.auth;

import com.example.bayernmunichproject.enums.roles.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstName;
    private String lastName;
    private String userName;
//    @ValidPassword(
//            message = "Password must contain minimum 8 characters, uppercase," +
//                    " lowercase, special character and digit! ")
    private String password;
    private RoleEnum role;
}
