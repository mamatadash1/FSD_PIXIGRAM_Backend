package com.mamata.fsd.domain.pictures;

import org.springframework.web.multipart.MultipartFile;

import com.mamata.fsd.domain.DDD;

import java.util.Set;

@DDD.Repository
public interface Pictures {

    Picture storePictureForCurrentUser(MultipartFile multipartFile, String name, boolean sharedToFollowers, String description);

    Picture getPicture(String pictureId);

    Set<Picture> getPicturesForUser(String username, boolean sharedToFollowers);

    Set<Picture> getPicturesForMyGallery();

    void addComment(String pictureId, String comment);

    void addLike(String pictureId);

    void removeLike(String pictureId);

    void rename(String newImageName, String pictureId);

    void delete(String pictureId);

    void hide(String pictureId);

    void unhide(String pictureId);
}
