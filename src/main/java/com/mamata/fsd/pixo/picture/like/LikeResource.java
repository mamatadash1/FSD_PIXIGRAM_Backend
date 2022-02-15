package com.mamata.fsd.pixo.picture.like;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mamata.fsd.picture.like.AddLike;
import com.mamata.fsd.picture.like.ViewLikes;

import java.util.List;

@RestController
@RequestMapping("/api/like")
@CrossOrigin(origins = "*")
public class LikeResource {
    @Autowired
    private AddLike addLike;
    @Autowired
    private ViewLikes viewLikes;

    @RequestMapping(value = "/{imageId}", method = RequestMethod.POST)
    public ResponseEntity likeImage(
            @PathVariable(value = "imageId") String imageId
    ) {
        addLike.addLike(imageId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/{imageId}", method = RequestMethod.GET)
    public ResponseEntity<List<String>> allLikes(
            @PathVariable(value = "imageId") String imageId
    ) {
        return new ResponseEntity(viewLikes.allLikes(imageId), HttpStatus.OK);
    }
}
