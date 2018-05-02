package Service.impl;

import Service.ConnectionFactory;
import Service.SocketConnection;

import java.net.Socket;

/**
 * Created by ccy
 * 2018/5/2 10:34
 */
public class ConnectionFactoryImpl implements ConnectionFactory {
    private int PRINTPORT = 9100;
    SocketConnection connection = null;

    @Override
    public SocketConnection createSocketConnection(String ip) {
        try {
            Socket socket = new Socket(ip, PRINTPORT);
            connection = new SocketConnectionImpl(socket);
        } catch (Exception e) {
            System.out.println("【ConnectionFactoryImpl】中抛出了异常");
            e.printStackTrace();
        }
        return connection;
    }
}
