package icu.lijiaqi.springtest.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author : LeeGaki
 * @date : 2022/7/17 10:42
 * 面向面试编程 --> 李佳琪
 */
@RestController
public class Upload {

    @PostMapping("/Upload")
    @ApiOperation("文件上传")
    public String upload(@RequestPart("multipartFile") MultipartFile multipartFile,
                         @RequestPart("photos") MultipartFile[] multipartFiles) throws IOException {
        if (!multipartFile.isEmpty()){
            String originalFilename = multipartFile.getOriginalFilename();
            System.out.println(originalFilename+2);
            multipartFile.transferTo(new File("D:\\"+originalFilename));
        }
        if (multipartFiles.length>0){
            for (MultipartFile file : multipartFiles) {
                if (!file.isEmpty()){
                    System.out.println(file.getOriginalFilename()+1);
                    String originalFilename = file.getOriginalFilename();
                    file.transferTo(new File("D:\\"+originalFilename));
                }
            }
        }
        return "true";
    }
}
