package Service.impl;

import Service.ConnectionFactory;
import Service.ConnectionManage;
import Service.SocketConnection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ccy
 * 2018/5/2 10:46
 */
public class ConnectionManageImpl implements ConnectionManage {
    Map<String, SocketConnection> connectionMap = new HashMap<>();  //printId
    ConnectionFactory connectionFactory = new ConnectionFactoryImpl();

    @Override
    public SocketConnection getSocketConnection(String printId) {
        if (!connectionMap.containsKey(printId)) {
            String ip = "10.90.102.244";
            SocketConnection connection = connectionFactory.createSocketConnection(ip);
            if (connection != null) {
                connectionMap.put(printId, connection);
            }
            return connection;
        } else {
            return connectionMap.get(printId);
        }

    }
}
