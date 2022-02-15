package com.mamata.fsd.pixo.picture;

import org.springframework.web.multipart.MultipartFile;

import com.mamata.fsd.picture.StorePictureCommand;

public class UploadPictureRepresentation {

    public MultipartFile file;
    public String pictureName;
    public boolean sharedToFollowers;
    public String pictureDescription;

    public StorePictureCommand toStorePictureCommand() {
        return new StorePictureCommand(this.file, this.pictureName, this.sharedToFollowers, this.pictureDescription);
    }
}
