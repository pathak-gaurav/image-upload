package com.gauravpathak.imageupload.controller;

import com.gauravpathak.imageupload.service.ImageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
public class ImageController {

    private ImageService service;

    public ImageController(ImageService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String showHome(){
        return "home";
    }

    @PostMapping("/uploadImage")
    public String uploadImage(@RequestParam("imageFile") MultipartFile imageFile, Model model) {
        try {
            service.saveImage(imageFile);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("Error Saving Photo", e);
        }
        return "home";
    }
}
