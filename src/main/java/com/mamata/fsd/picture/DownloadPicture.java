package com.mamata.fsd.picture;

import com.mamata.fsd.domain.DDD;
import com.mamata.fsd.domain.IdentitySupplier;
import com.mamata.fsd.domain.pictures.Picture;
import com.mamata.fsd.domain.pictures.Pictures;
import com.mamata.fsd.domain.user.User;
import com.mamata.fsd.domain.user.Users;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@DDD.ApplicationService
@Service
public class DownloadPicture {

    @Autowired
    private Pictures pictures;
    @Autowired
    private Users users;
    @Autowired
    private IdentitySupplier identitySupplier;

    public byte[] downloadPicture(String pictureId) throws IOException {
        Picture picture = pictures.getPicture(pictureId);
        InputStream in = new BufferedInputStream(new FileInputStream(picture.getImagePath().getPath()));
        return IOUtils.toByteArray(in);
    }

    public byte[] downloadProfilePicture() throws IOException {
        User user = users.findOne(identitySupplier.get().getUsername());
        return downloadPicture(user.getProfilePictureId());
    }
}
