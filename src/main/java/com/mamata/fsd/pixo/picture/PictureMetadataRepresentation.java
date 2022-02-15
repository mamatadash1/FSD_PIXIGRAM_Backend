package com.mamata.fsd.pixo.picture;

import java.util.ArrayList;
import java.util.List;

import com.mamata.fsd.domain.pictures.Picture;

public class PictureMetadataRepresentation {

    public String name;
    public String description;
    public List<String> likedBy;
    public boolean visibleToFollowers;

    public PictureMetadataRepresentation(Picture picture) {
        this.name = picture.getName();
        this.description = picture.getDescription();
        this.likedBy = new ArrayList<>(picture.getLikedBy());
        this.visibleToFollowers = picture.isSharedToFollowers();
    }
}
