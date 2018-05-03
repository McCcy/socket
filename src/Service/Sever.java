package Service;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ccy
 * 2018/4/28 11:20
 */
public class Sever {

    private static Socket socket;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9100);
            System.out.println("服务器正常启动");
            while (true) {
                socket = serverSocket.accept();//阻塞方法
                new ServerThread(socket).start();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
