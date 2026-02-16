package com.pikauser.pika_user_manager.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "users")
public class User {

    //    @Indexed(unique = true)
    @Id
    private String username;

    private String firstName;

    private String lastName;

    //Unique EmailId we give to the user
    private String email;

    private String password;

    //company name
    private String company;

    private long insertTime;

    private long updateTime;

    private String status;

    //existing or new - currently not in use
    private String companyType;

    //we have verified and unverified
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
