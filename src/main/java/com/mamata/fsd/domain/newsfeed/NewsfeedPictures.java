package com.mamata.fsd.domain.newsfeed;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.followers.Follower;
import com.mamata.fsd.domain.followers.Followers;
import com.mamata.fsd.domain.pictures.Picture;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@DDD.DomainService
@Service
public class NewsfeedPictures {

    @Autowired
    private Pictures pictures;
    @Autowired
    private Followers followers;

    public Set<Picture> findPictureIdsForNewsfeed() {
        Set<Follower> usersFollowed = followers.findFollowersForCurrentUser();
        Set<Picture> pictureIds = new HashSet<>();
        usersFollowed.forEach( follower -> {
            pictureIds.addAll(pictures.getPicturesForUser(follower.getFollowedEmail(), true));
        });
        return pictureIds;
    }
}
