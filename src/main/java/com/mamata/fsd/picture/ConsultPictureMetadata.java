package com.mamata.fsd.picture;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.pictures.Picture;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DDD.ApplicationService
@Service
public class ConsultPictureMetadata {

    @Autowired
    private Pictures pictures;

    public Picture getPictureMetadata(String pictureId) {
        Picture picture = pictures.getPicture(pictureId);
        return picture;
    }
}
