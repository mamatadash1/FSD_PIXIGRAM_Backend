package com.mamata.fsd.newsfeed;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.IdentitySupplier;
import com.mamata.fsd.domain.newsfeed.NewsfeedPictures;
import com.mamata.fsd.domain.pictures.Picture;
import com.mamata.fsd.domain.pictures.Pictures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@DDD.ApplicationService
@Service
public class ConsultNewsfeed {

    @Autowired
    private NewsfeedPictures newsfeedPictures;
    @Autowired
    private IdentitySupplier identitySupplier;

    public Set<String> getAllImageIdsForNewsfeed() {
        return newsfeedPictures.findPictureIdsForNewsfeed().stream().map(Picture::getPictureId).collect(Collectors.toSet());
    }

}
