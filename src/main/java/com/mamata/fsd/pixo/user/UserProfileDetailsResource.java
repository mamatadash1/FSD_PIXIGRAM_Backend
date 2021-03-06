package com.mamata.fsd.pixo.user;

import com.mamata.fsd.domain.user.User;
import com.mamata.fsd.user.UserProfileDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user-details")
public class UserProfileDetailsResource {

    @Autowired
    private UserProfileDetails userProfileDetails;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<UserProfileDetailsRepresentation> consultUserProfile() {
        User user = userProfileDetails.getUserProfileDetails();
        return new ResponseEntity<>(new UserProfileDetailsRepresentation(user), HttpStatus.OK);
    }
}
