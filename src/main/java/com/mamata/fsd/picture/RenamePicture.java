package com.mamata.fsd.picture;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DDD.ApplicationService
@Service
public class RenamePicture {

    @Autowired
    private Pictures pictures;

    public void rename(String newImageName, String pictureId) {
        pictures.rename(newImageName, pictureId);
    }
}
