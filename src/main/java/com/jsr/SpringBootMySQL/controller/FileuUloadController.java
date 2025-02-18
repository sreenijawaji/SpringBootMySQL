package com.jsr.SpringBootMySQL.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FileuUloadController {


    @GetMapping("/fileUploadHome")
    public String welcome(){
        return "upload";
    }

    @PostMapping("/fileUpload")
    public String fileUpload(@RequestParam("file") MultipartFile file, Model model) throws IOException {
        Path path = Paths.get("/resouces/"+ file.getOriginalFilename());
        Files.write(path, file.getBytes());
        model.addAttribute("message", "File has been uploaded successfuly");
        return "welcome to JSR technologies";
    }

}
