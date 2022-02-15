package com.mamata.fsd.picture.like;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@DDD.ApplicationService
@Service
@Transactional
public class AddLike {

    @Autowired
    private Pictures pictures;

    public void addLike(String pictureId) {
        pictures.addLike(pictureId);
    }
}
