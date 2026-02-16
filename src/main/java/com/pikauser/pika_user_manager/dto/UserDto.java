package com.pikauser.pika_user_manager.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    @NotNull
    @Pattern(regexp = "^(?=.*[a-zA-Z])[a-zA-Z0-9_.-]*$", message = "Invalid username")
//    @Schema(example = "test_User.12-3")
    private String username;

    @NotNull
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Invalid firstname")
//    @Schema(example = "Test")
    private String firstName;

    @NotNull
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Invalid lastname")
//    @Schema(example = "User1")
    private String lastName;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9._+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$", message = "Invalid email")
//    @Schema(example = "test@example.com")
    private String email;

    @NotNull
    private String password;

    private String company;

    private long insertTime;

    private long updateTime;

    private String status;

    private String companyType;

    private String realCompanyType;

    private List<String> modules;

    private long verifiedTime;

    private long selfVerifiedTime;

    private String userType;

    private String realCompany;

    private String domain;

    private String role;

    private Boolean isDeleted = false;

    private String updatedBy;
    private String profileUrl;
    private String session;
    private String bcryptPassword;

}
