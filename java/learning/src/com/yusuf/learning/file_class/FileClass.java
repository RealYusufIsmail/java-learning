package com.yusuf.learning.file_class;

import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        //File = An abstract representation of file and directory pathnames.

        File file = new File("src/com/yusuf/learning/file_class/document.txt/");
        //says That file exists

        if(file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            //file.delete(); //will delete the file
        } else {
            System.out.println("That file does not exist");
        }
    }
}
