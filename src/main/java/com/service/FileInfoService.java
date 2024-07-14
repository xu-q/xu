package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.FileInfo;

public interface FileInfoService extends IService<FileInfo> {

    void addFileInfo(String path);

}
