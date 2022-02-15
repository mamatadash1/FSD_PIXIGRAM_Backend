package com.mamata.fsd.subscribers;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.followers.Followers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@DDD.ApplicationService
@Service
@Transactional
public class UnregisterSubscriber {

    @Autowired
    private Followers followers;

    public void deleteSubscriber(String subscriberEmail) {
        followers.removeFollower(subscriberEmail);
    }
}
