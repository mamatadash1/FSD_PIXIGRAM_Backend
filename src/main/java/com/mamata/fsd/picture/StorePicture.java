package com.mamata.fsd.picture;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.IdentitySupplier;
import com.mamata.fsd.domain.pictures.Picture;
import com.mamata.fsd.domain.pictures.Pictures;
import com.mamata.fsd.domain.user.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@DDD.ApplicationService
@Service
@Transactional
public class StorePicture {

    @Autowired
    private Pictures pictures;
    @Autowired
    private Users users;

    public Picture storePicture(StorePictureCommand storePictureCommand) {
        Picture storedPicture = pictures.storePictureForCurrentUser(
                storePictureCommand.getMultipart(),
                storePictureCommand.getPictureName(),
                storePictureCommand.isSharedToFollowers(),
                storePictureCommand.getPictureDescription()
        );
        return storedPicture;
    }
}
