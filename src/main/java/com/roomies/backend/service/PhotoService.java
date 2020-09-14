package com.roomies.backend.service;

import com.roomies.backend.data.Photo;
import com.roomies.backend.repository.PhotoRepository;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PhotoService {

  @Autowired
  PhotoRepository photoRepository;

  public String uploadPhoto(String title, MultipartFile file) throws IOException {
    Photo photo = new Photo(title);
    photo.setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
    photo = photoRepository.insert(photo);
    return photo.getId();
  }

  public Photo findById(String id) {
    return photoRepository.findById(id).orElseThrow(RuntimeException::new);
  }

  public void deleteById(String id) {
    photoRepository.deleteById(id);
  }

}
