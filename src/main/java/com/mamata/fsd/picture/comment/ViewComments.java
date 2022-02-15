package com.mamata.fsd.picture.comment;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.pictures.Picture;
import com.mamata.fsd.domain.pictures.PictureComment;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@DDD.ApplicationService
@Service
public class ViewComments {

    @Autowired
    private Pictures pictures;

    public Set<PictureComment> allComments(String pictureId) {
        Picture picture = pictures.getPicture(pictureId);
        return picture.getComments();
    }
}
