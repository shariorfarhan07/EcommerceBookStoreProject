package com.example.ecommercebookstoreproject.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.*;
import java.util.Date;

public class photosave {
    public static String uploadDirectory=System.getProperty("user.dir")+"/uploads";

    public boolean imageSave(MultipartFile file) throws IOException {
       // StringBuilder fileNames=new StringBuilder();
        Date date=new Date();
        String dateString= date.toString().replace(" ","").replace(":","");
        System.out.println(file.getOriginalFilename());
        String filename=file.getOriginalFilename().replace(" ","")+dateString;
        Path fileNameAndpath= Paths.get(uploadDirectory,filename);
        Files.write(fileNameAndpath,file.getBytes());
        return true;
    }

    public boolean imageDelete(String file){

        Path path = Paths.get("./uploads/"+file);
        try {
            // Delete file or directory
            Files.delete(path);
            System.out.println("File or directory deleted successfully");
        } catch (NoSuchFileException ex) {
            System.out.printf("No such file or directory: %s\n", path);
        } catch (DirectoryNotEmptyException ex) {
            System.out.printf("Directory %s is not empty\n", path);
        } catch (IOException ex) {
            System.out.println(ex);
        }

        return  true;
    }


}
