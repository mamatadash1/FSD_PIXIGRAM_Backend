package com.mamata.fsd.user;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.IdentitySupplier;
import com.mamata.fsd.domain.user.User;
import com.mamata.fsd.domain.user.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DDD.ApplicationService
@Service
public class UserProfileDetails {

    @Autowired
    private IdentitySupplier identitySupplier;

    @Autowired
    private Users users;

    public User getUserProfileDetails() {
        return users.findOne(identitySupplier.get().getUsername());
    }
}
