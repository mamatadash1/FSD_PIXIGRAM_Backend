package com.mamata.fsd.picture.visibility;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.pictures.Pictures;
import com.netflix.discovery.converters.Auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DDD.ApplicationService
@Service
public class HidePicture {

    @Autowired
    private Pictures pictures;

    public void hide(String pictureId) {
        pictures.hide(pictureId);
    }
}
