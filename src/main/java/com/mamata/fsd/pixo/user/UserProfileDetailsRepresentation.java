package com.mamata.fsd.pixo.user;

import static com.mamata.fsd.pixo.LocalDateTimeAdapter.dateTimeToStringFormatter;

import com.mamata.fsd.domain.user.User;

public class UserProfileDetailsRepresentation {

    public String email;
    public String profilePictureId;
    public String registrationDate;
    public String firstName;
    public String lastName;

    public UserProfileDetailsRepresentation(User user) {
        this.email = user.getEmail();
        this.profilePictureId = user.getProfilePictureId();
        this.registrationDate = dateTimeToStringFormatter(user.getRegistrationDate());
        this.lastName = user.getLastName();
        this.firstName = user.getFirstName();
    }
}
