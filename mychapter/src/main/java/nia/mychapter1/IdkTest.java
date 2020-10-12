package nia.mychapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Gy
 * @description
 * @created 2020/9/22
 */
public class IdkTest {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8081);
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(
                new InputStreamReader(socket.getInputStream())
        );

    }
}
