package com.mamata.fsd.mygallery;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.IdentitySupplier;
import com.mamata.fsd.domain.pictures.Picture;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@DDD.ApplicationService
@Service
public class ConsultMyGallery {

    @Autowired
    private Pictures pictures;
    @Autowired
    private IdentitySupplier identitySupplier;

    public Set<String> getAllImageIds() {
        return pictures.getPicturesForMyGallery(
        ).stream().map(Picture::getPictureId).collect(Collectors.toSet());
    }
}
