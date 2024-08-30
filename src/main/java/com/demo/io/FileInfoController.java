package com.demo.io;

import com.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/fileInfo")
@RestController
public class FileInfoController {

    @Autowired(required = false)
    private FileInfoService fileInfoService;

    @PutMapping("/addFile")
    public void addFile(String path) {
        fileInfoService.addFileInfo(path);
    }
}
