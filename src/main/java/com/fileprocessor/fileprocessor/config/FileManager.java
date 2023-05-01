package com.fileprocessor.fileprocessor.config;

import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileManager {

    public FileManager() {
    }

    public String fileMover(String path, String destination) {

        try {
            Files.move(Paths.get(path), Paths.get(destination), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return "SUCCESS: File moved to: "+ destination;
    }


}
