package com.okc.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 * @Package: com.okc.io
 * @ClassName: FileDemo
 * @Description:
 * @Author: okc
 * @Date: 2021/8/4 1:04
 * @Version 1.8
 **/

public class FileDemo {
    public static void main(String[] args) {
        //文件的相关操作
        File file = new File("D:\\test\\OK.txt");
        System.out.println("文件的绝对路径："+file.getAbsoluteFile());
        System.out.println("文件名："+file.getName());
        System.out.println("文件大小："+file.length());
        System.out.println("========================================");

        //判断文件是否存在
        if (file.exists()){
            //若存在，即删除
            //file.delete();
        }else {
            try {
                //如果不存在，即创建
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("是否为文件："+file.isFile());
        System.out.println("是否为文件夹："+file.isDirectory());
        System.out.println("========================================");
        //文件夹的相关操作
        File dir = new File("D:\\test\\test1");
        System.out.println("文件夹的绝对路径："+dir.getAbsoluteFile());
        System.out.println("文件夹名："+dir.getName());
        System.out.println("文件夹大小："+dir.length());
        System.out.println("========================================");
        //判断文件夹是否存在
        if (dir.exists()){
            //存在，不操作
            //dir.delete();
        }else {
            //不存在，即创建
            //创建单级目录
            dir.mkdir();
            //创建多级目录
            //dir.mkdirs();
        }
        System.out.println("是否为文件："+dir.isFile());
        System.out.println("是否为文件夹："+dir.isDirectory());
        System.out.println("========================================");
        //字符串形式打印目录下文件信息
        String[] lists = dir.list();
        for (String list : lists) {
            System.out.println(list);
        }
        System.out.println("========================================");
        //文件路径形式打印目录下文件信息
        File[] lists2 = dir.listFiles();
        for (File list : lists2) {
            System.out.println(list);
        }
        System.out.println("========================================");
        //遍历所有文件包括子层级文件夹里的文件
        printDir(dir);
        System.out.println("========================================");
        //遍历所有文件包括子层级文件夹里的带txt后缀的文件
        printDirEnd(dir);
        System.out.println("========================================");
        //遍历所有文件包括子层级文件夹里的带txt后缀的文件,使用FileFilter接口
        printDirFilter(dir);

    }

    //递归遍历
    public static void printDir(File dir){
        if (dir.isFile()){
            System.out.println(dir);
        }else {
            File[] files = dir.listFiles();
            for (File file : files) {
                //子层级文件夹继续判断
                if (file.isFile()){
                    System.out.println(file);
                }else {
                    printDir(file);
                }
            }
        }
    }

    //递归遍历带xxx后缀的文件
    public static void printDirEnd(File dir1){
        if (dir1.isFile() && dir1.getName().endsWith(".txt")){
            System.out.println(dir1);
        }else {
            File[] files = dir1.listFiles();
            if (files!=null){
                for (File file : files) {
                    //子层级文件夹继续判断
                    if (file.isFile() && file.getName().endsWith(".txt")){
                        System.out.println(file);
                    }else {
                        printDirEnd(file);
                    }
                }
            }
        }
    }
    //递归遍历带xxx后缀的文件,使用FileFilter接口
    public static void printDirFilter(File dir1){
        if (dir1.isFile() && dir1.getName().endsWith(".txt")){
            System.out.println(dir1);
        }else {
            File[] files = dir1.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.isDirectory()||file.getName().endsWith(".txt");
                }
            });
            if (files!=null){
                for (File file : files) {
                    if (file.isDirectory()){
                        printDirFilter(file);
                    }else {
                        System.out.println(file);
                    }
                }
            }
        }
    }

}
