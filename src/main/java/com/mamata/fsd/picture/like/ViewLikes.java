package com.mamata.fsd.picture.like;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.pictures.Picture;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@DDD.ApplicationService
@Service
public class ViewLikes {

    @Autowired
    private Pictures pictures;

    public Set<String> allLikes(String pictureId) {
        Picture picture = pictures.getPicture(pictureId);
        return picture.getLikedBy();
    }
}
