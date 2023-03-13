package test20210517;

import java.io.File;

/**
 * @author Yunxiong
 * @version 1.0
 * @date 2021-05-17
 */
public class RenameFiles {
    public static void main(String[] args) {

        String path = "D:\\PodcastDownload\\Grover Podcast\\1";//要遍历的路径
        File file = new File(path);        //获取其file对象
        func(file);

    }
    private static void func(File file){
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isDirectory())    //若是目录，则递归打印该目录下的文件
                func(f);
            if(f.isFile()) {
                String name = f.getName();

                int ep = name.indexOf("Ep");

                String substring = name.substring(ep, ep + 5);

                String newName = substring +" | "+ name;

                File file2 = new File("D:\\PodcastDownload\\Grover Podcast\\1\\"+newName);
                f.renameTo(file2);

            }
        }
        System.out.println("重命名成功");
    }
}
