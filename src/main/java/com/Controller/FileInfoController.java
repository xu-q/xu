package com.Controller;

import com.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/fileInfo")
@RestController
public class FileInfoController {

    @Autowired(required = false)
    private FileInfoService fileInfoService;

    @RequestMapping("/addFile")
    public void addFile(String path) {
        fileInfoService.addFileInfo(path);
    }
}
