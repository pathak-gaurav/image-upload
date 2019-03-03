package com.gauravpathak.imageupload.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

    void saveImage(MultipartFile imageFile)throws Exception;
}
