package com.mamata.fsd.pixo.subscribers;

import com.mamata.fsd.domain.followers.Subscriber;

public class SubscribedRepresentation {

    public String email;
    public boolean isSubscribed;

    public SubscribedRepresentation(Subscriber subscriber) {
        this.email = subscriber.getSubscriberEmail();
        this.isSubscribed = subscriber.isSubscribed();
    }
}
