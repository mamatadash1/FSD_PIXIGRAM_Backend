package com.mamata.fsd.pixo.picture;

import com.mamata.fsd.picture.DownloadPicture;
import com.mamata.fsd.pixo.SingleValue;
import com.netflix.discovery.converters.Auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/profile-picture")
@CrossOrigin(origins = "*")
public class ProfilePictureResource {

    @Autowired
    private DownloadPicture downloadPicture;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getRandomProfilePicture() throws Exception {
        HttpHeaders headers = new HttpHeaders();
        byte[] media = downloadPicture.downloadProfilePicture();
        headers.setCacheControl(CacheControl.noCache().getHeaderValue());
        return new ResponseEntity<>(media, headers, HttpStatus.OK);
    }
}
