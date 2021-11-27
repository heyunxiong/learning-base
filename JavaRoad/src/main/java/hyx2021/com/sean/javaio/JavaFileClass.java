package hyx2021.com.sean.javaio;

import java.io.File;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 11/22/2020
 */
public class JavaFileClass {
    public static void main(String[] args) {
        File file = new File("TestChar.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

    }
}
