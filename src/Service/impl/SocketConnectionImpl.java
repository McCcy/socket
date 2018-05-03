package Service.impl;

import Service.SocketConnection;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * Created by ccy
 * 2018/5/2 10:20
 */
public class SocketConnectionImpl implements SocketConnection {
    private Socket socket;
    OutputStreamWriter writer;
    OutputStream ot;

    public SocketConnectionImpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void sendMsg(String msg) {
        try {
            ot = socket.getOutputStream();
            writer = new OutputStreamWriter(ot, "GBK");
            writer.write(msg);
            writer.flush();
        } catch (Exception e) {
            System.out.println("【SocketConnectionImpl 的 sendMsg()】中抛出了异常");
            e.printStackTrace();
        }
    }
}
