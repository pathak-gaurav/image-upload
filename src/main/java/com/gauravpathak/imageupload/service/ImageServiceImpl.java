package com.gauravpathak.imageupload.service;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class ImageServiceImpl implements ImageService {

    @Override
    public void saveImage(MultipartFile imageFile) throws Exception {
        String folder = "C:\\photos\\";
        byte[] bytes = imageFile.getBytes();
        Path path = Paths.get(folder + imageFile.getOriginalFilename());
        Files.write(path, bytes);
    }
}
