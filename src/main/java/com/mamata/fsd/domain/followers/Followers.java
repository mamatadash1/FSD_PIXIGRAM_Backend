package com.mamata.fsd.domain.followers;

import java.util.Set;

import com.mamata.fsd.domain.DDD;

@DDD.Repository
public interface Followers {

    Set<Follower> findFollowersForCurrentUser();

    void addFollower(String email);

    void removeFollower(String email);
}
