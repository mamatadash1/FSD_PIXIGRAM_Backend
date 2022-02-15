package com.mamata.fsd.picture;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@DDD.ApplicationService
@Service
public class DeletePicture {

    @Autowired
    private Pictures pictures;

    public void delete(String pictureId) {
        pictures.delete(pictureId);
    }
}
