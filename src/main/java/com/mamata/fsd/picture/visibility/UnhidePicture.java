package com.mamata.fsd.picture.visibility;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DDD.ApplicationService
@Service
public class UnhidePicture {

    @Autowired
    private Pictures pictures;

    public void unhide(String pictureId) {
        pictures.unhide(pictureId);
    }
}
