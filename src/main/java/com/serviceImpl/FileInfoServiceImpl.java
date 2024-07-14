package com.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.entity.FileInfo;
import com.mapper.FileInfoMapper;
import com.service.FileInfoService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class FileInfoServiceImpl extends ServiceImpl<FileInfoMapper, FileInfo> implements FileInfoService {

    @Override
    public void addFileInfo(String path) {
        List<String> filePaths = getAllFileName(path, new ArrayList<>());
        filePaths.stream().forEach(f -> {
            FileInfo fi = new FileInfo();
            fi.setPath(f);
            save(fi);
        });
    }

    public List<String> getAllFileName(String path, List<String> filePaths) {
        File file = new File(path);
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                if (f.isDirectory()) {
                    getAllFileName(f.getPath(), filePaths);
                }
                if (f.isFile()) {
                    filePaths.add(f.getPath());
                }
            }
        }
        return filePaths;
    }
}
