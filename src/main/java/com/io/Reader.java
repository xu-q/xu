package com.io;

import java.io.*;

public class Reader {
    public static void main(String[] args) throws IOException {
        //System.out.println(wordsCount("C:\\Users\\xuqin\\Desktop\\新建 文本文档.txt", "我爱你"));
        getAllFileName("C:\\Users\\xuqin\\Desktop\\学位英语 资料包");
    }

    public static int wordsCount(String path, String words) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = null;
        while ((line = br.readLine()) !=null){
            System.out.println(line);
            if(line.indexOf(words) >0){
                count ++;
            }
        }
        br.close();
        return count;
    }

    public static void getAllFileName(String path){
        File file = new File(path);
        if(file.isDirectory()){
            for (File f : file.listFiles()) {
                getAllFileName(f.getPath());
                if(f.isFile()){
                    System.out.println(f.getPath());
                }
            }
        }
    }
}
