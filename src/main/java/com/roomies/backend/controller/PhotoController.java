package com.roomies.backend.controller;

import com.roomies.backend.service.PhotoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.io.IOException;

@RestController
@RequestMapping("/api/photo")
public class PhotoController {

  @Autowired
  PhotoService photoService;

  @GetMapping(value = "/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
  public @ResponseBody byte[] getImageById(@PathVariable String id) {
    return photoService.findById(id).getImage().getData();
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable String id) {
    photoService.deleteById(id);
  }

  @PostMapping("/upload")
  public String uploadPhoto(@RequestParam("title") String title,
                            @RequestParam("image") MultipartFile image) throws IOException {
    String id = photoService.uploadPhoto(title, image);
    return "redirect:/photos/" + id;
  }

}
