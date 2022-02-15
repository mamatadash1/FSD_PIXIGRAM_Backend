package com.mamata.fsd.subscribers;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.followers.AllSubscribers;
import com.mamata.fsd.domain.followers.Subscriber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@DDD.ApplicationService
@Service
public class ConsultSubscribers {

    @Autowired
    private AllSubscribers allSubscribers;

    public Set<Subscriber> getAllSubscribers() {
        return allSubscribers.findAllPossibleSubscribers();
    }
}
