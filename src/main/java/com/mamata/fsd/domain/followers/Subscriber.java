package com.mamata.fsd.domain.followers;

import com.mamata.fsd.domain.DDD;

import lombok.AllArgsConstructor;
import lombok.Getter;

@DDD.ValueObject @Getter @AllArgsConstructor
public class Subscriber {

    private String subscriberEmail;
    private boolean isSubscribed;

}
