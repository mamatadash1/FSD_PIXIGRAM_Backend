package com.mamata.fsd.pixo.picture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.mamata.fsd.picture.DownloadPicture;

@RestController
@RequestMapping("/api/download-image")
@CrossOrigin(origins = "*")
public class DownloadPictureResource {

    @Autowired
    private DownloadPicture downloadPicture;

    @RequestMapping(value = "/{imageId}", method = RequestMethod.GET, produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<byte[]> getImage(@PathVariable(value = "imageId") String imageId) throws Exception {
        HttpHeaders headers = new HttpHeaders();
        byte[] media = downloadPicture.downloadPicture(imageId);
        headers.setCacheControl(CacheControl.noCache().getHeaderValue());
        return new ResponseEntity<>(media, headers, HttpStatus.OK);
    }
}
