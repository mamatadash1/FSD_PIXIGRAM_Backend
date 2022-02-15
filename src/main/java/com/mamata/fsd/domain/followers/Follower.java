package com.mamata.fsd.domain.followers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.mamata.fsd.domain.DDD;

import java.time.LocalDateTime;
import java.util.UUID;

@DDD.Entity
@Entity @Table(name = "FOLLOWERS")
@NoArgsConstructor @Getter @Setter @AllArgsConstructor
public class Follower {

    @Id @NotNull
    private String id;
    @Column(name = "FOLLOWER_ID")
    private String followerEmail;
    @Column(name = "FOLLOWED_ID")
    private String followedEmail;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFollowerEmail() {
		return followerEmail;
	}
	public void setFollowerEmail(String followerEmail) {
		this.followerEmail = followerEmail;
	}
	public String getFollowedEmail() {
		return followedEmail;
	}
	public void setFollowedEmail(String followedEmail) {
		this.followedEmail = followedEmail;
	}

    
}
