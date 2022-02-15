package com.mamata.fsd.domain.user;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.mamata.fsd.domain.DDD;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@DDD.AggregateRoot
@Entity @Table(name = "APP_USERS")
@NoArgsConstructor @Getter @Setter
@AllArgsConstructor
public class User {

    @Id @NotNull
    private String email;

    @Column
    private String password;

    @Column(name = "PROFILE_PICTURE_ID")
    private String profilePictureId;

    @Column(name = "REG_DATE")
    private LocalDateTime registrationDate;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ACTIVE")
    private boolean active;

}
