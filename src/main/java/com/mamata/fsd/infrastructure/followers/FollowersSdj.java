package com.mamata.fsd.infrastructure.followers;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mamata.fsd.domain.followers.Follower;

@Repository
public interface FollowersSdj extends JpaRepository<Follower, String> {

    List<Follower> findAllByFollowerEmail(String followerEmail);

    Follower findFollowerByFollowedEmailAndFollowerEmail(String followedEmail, String followerEmail);
}
