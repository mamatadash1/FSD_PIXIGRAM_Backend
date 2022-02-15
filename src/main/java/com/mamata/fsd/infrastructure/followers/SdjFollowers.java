package com.mamata.fsd.infrastructure.followers;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.IdentitySupplier;
import com.mamata.fsd.domain.followers.Follower;
import com.mamata.fsd.domain.followers.Followers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import static java.util.Objects.isNull;

@DDD.RepositoryImpl
@Service
public class SdjFollowers implements Followers {

    @Autowired
    private FollowersSdj followersSdj;
    @Autowired
    private IdentitySupplier identitySupplier;

    @Override
    public Set<Follower> findFollowersForCurrentUser() {
        List<Follower> followers = followersSdj.findAllByFollowerEmail(identitySupplier.get().getUsername());
        return new HashSet<>(followers);
    }

    @Override
    public void addFollower(String email) {
        //TODO if exists already do nothing
        Follower newFollower = new Follower(UUID.randomUUID().toString(), identitySupplier.get().getUsername(), email);
        followersSdj.save(newFollower);
    }

    @Override
    public void removeFollower(String email) {
        Follower follower = followersSdj.findFollowerByFollowedEmailAndFollowerEmail(email, identitySupplier.get().getUsername());
        if(!isNull(follower)) {
            followersSdj.delete(follower);
            followersSdj.flush();
        }
    }
}
