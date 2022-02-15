package com.mamata.fsd.pixo.picture.rename;

import com.mamata.fsd.domain.pictures.Picture;
import com.mamata.fsd.picture.RenamePicture;
import com.mamata.fsd.picture.StorePictureCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/rename")
@CrossOrigin(origins = "*")
public class RenamePictureResource {

    @Autowired
    private RenamePicture renamePicture;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ResponseEntity uploadPicture(@RequestParam("pictureName") String pictureName, @RequestParam("pictureId") String pictureId){
        renamePicture.rename(pictureName, pictureId);
        return new ResponseEntity(HttpStatus.OK);
    }

}
