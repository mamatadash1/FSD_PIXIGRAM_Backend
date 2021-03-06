package com.mamata.fsd.pixo.picture.comment;

import com.mamata.fsd.domain.pictures.PictureComment;
import com.mamata.fsd.picture.comment.AddComment;
import com.mamata.fsd.picture.comment.ViewComments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@RestController
@RequestMapping("/api/comment")
@CrossOrigin(origins = "*")
public class CommentResource {

    @Autowired
    private AddComment addComment;
    @Autowired
    private ViewComments viewComments;

    @RequestMapping(value = "/{imageId}", method = RequestMethod.POST)
    public ResponseEntity addComment(
            @PathVariable(value = "imageId") String imageId,
            @RequestBody CommentRepresentation commentRepresentation
    ) {
        addComment.addComment(imageId, commentRepresentation.comment);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/{imageId}", method = RequestMethod.GET)
    public ResponseEntity<List<CommentRepresentation>> getAllComments(
            @PathVariable(value = "imageId") String imageId
    ) {
        Set<PictureComment> comments = viewComments.allComments(imageId);
        List<CommentRepresentation> commentRepresentations = comments.stream().map( comm -> new CommentRepresentation(comm.getComment(), comm.getId())).collect(toList());
        return new ResponseEntity(commentRepresentations, HttpStatus.OK);
    }
}
