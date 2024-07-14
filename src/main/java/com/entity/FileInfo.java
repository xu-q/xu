package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("file_info")
@Data
public class FileInfo extends BaseField{

    private String path;
}
