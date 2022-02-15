package com.mamata.fsd.infrastructure.pictures;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mamata.fsd.domain.pictures.Picture;

@Repository
public interface PicturesSdj extends JpaRepository<Picture, String> {

    List<Picture> findPicturesByOwnerEmail(String ownerEmail);

    List<Picture> findPicturesByOwnerEmailAndSharedToFollowers(String ownerEmail, boolean sharedToFollowers);
}
