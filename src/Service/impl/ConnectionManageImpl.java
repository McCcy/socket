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
    Map<String, String> ipMap = new HashMap<String, String>();

    public ConnectionManageImpl() {
        for (int i = 0; i < 100; i++) {
            ipMap.put(i + "", "10.90.102.244");
        }

    }

    @Override
    public SocketConnection getSocketConnection(String printId) {
        if (!connectionMap.containsKey(printId)) {
            String ip = ipMap.get(printId);
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
