package com.mamata.fsd.picture.comment;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@DDD.ApplicationService
@Service
@Transactional
public class AddComment {

    @Autowired
    private Pictures pictures;

    public void addComment(String pictureId, String comment) {
        pictures.addComment(pictureId, comment);
    }
}
