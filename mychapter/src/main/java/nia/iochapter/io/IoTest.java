package nia.iochapter.io;

import java.io.*;

/**
 * @author Gy
 * @description
 * @created 2020/9/27
 */
public class IoTest {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("E:\\sth\\pic\\123new.txt");
        File file1 = new File("E:\\sth\\pic\\456new.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        int b;
        while ((b = fileInputStream.read()) != -1) {

        }

        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file1);
        int len;
        char[] data = new char[((Long) file.length()).intValue()];
        if ((len = fileReader.read(data)) != -1) {
            fileWriter.append(new String(data, 0, len));
            fileWriter.flush();
            //System.out.println(new String(data,0,len));
            fileWriter.close();
        }
        fileReader.close();

    }
}
