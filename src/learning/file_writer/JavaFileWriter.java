package com.yusuf.learning.file_writer;

import java.io.FileWriter;
import java.io.IOException;

public class JavaFileWriter {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("src/com/yusuf/learning/file_writer/poem.txt");
            writer.write("Rose are red \nViolets are blue \nI am the best");
            writer.append("\n(A poem by RealYusufIsmail)");
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
