package nia.iochapter.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import static java.io.File.separator;

/**
 * @author Gy
 * @description
 * @created 2020/9/27
 */
public class FileTest {

    //创建文件
    File file = new File("E:\\sth\\pic\\123.jpg");
    File file2 = new File("E:\\sth\\pic", "123.jpg");
    //目录
    File mulu = new File("E:\\sth\\pic");
    File file3 = new File(mulu, "123.jpg");
    //可以创建不存在的文件
    File file4 = new File(mulu, "123.txt");

    public static void main(String[] args) throws IOException {
        File f = new File("E:\\sth\\pic\\123new.txt");
        System.out.println(f.getAbsolutePath());
        File f2 = new File("123.jpg");
        System.out.println(f2.getAbsolutePath());
        System.out.println(separator);
        //f文件不存在时创建一个该文件
        f.createNewFile();

        File mulu = new File("E:\\sth\\pic");
        if (mulu.isDirectory()) {
            File mulu1 = new File("E:\\sth");
            System.out.println("目录的长度是：" + mulu1.length());
            File[] flist = mulu.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    name = name.toLowerCase();
                    if (name.endsWith(".txt")) {
                        return true;
                    }
                    return false;
                }
            });
            for (File file : flist) {
                System.out.println(file.getName());
            }
        }


    }


}
