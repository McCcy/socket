package Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by ccy
 * 2018/4/28 13:42
 */
public class ServerThread extends Thread{
    private Socket socket;
    private BufferedReader br;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            br=new BufferedReader(new InputStreamReader(socket.getInputStream(),"GBK"));
            String reply=null;
            while(!((reply=br.readLine())==null)){
                System.out.println("接收服务器的信息："+reply);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
