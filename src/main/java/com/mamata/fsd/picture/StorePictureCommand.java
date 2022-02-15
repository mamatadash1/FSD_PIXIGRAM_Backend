package com.mamata.fsd.picture;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import com.mamata.fsd.domain.DDD;

@DDD.ValueObject @Getter @AllArgsConstructor
public class StorePictureCommand {

    private MultipartFile multipart;
    private String pictureName;
    private boolean sharedToFollowers;
    private String pictureDescription;
}
