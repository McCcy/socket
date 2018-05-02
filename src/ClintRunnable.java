import Service.ConnectionManage;
import Service.Message;
import Service.SocketConnection;
import Service.impl.ConnectionManageImpl;
import Service.impl.MessageTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ccy
 * 2018/4/28 11:05
 */
public class ClintRunnable implements Runnable {

    ConnectionManage connectionManage = new ConnectionManageImpl();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            SocketConnection socketConnection = connectionManage.getSocketConnection("1");
            Message message = new MessageTemplate("1");
            Map<String, String> dataMap = new HashMap<String, String>();
            dataMap.put("name", "ccy");
            dataMap.put("age", "18");
            socketConnection.sendMsg(message.getText(dataMap));
            System.out.println("【 " + Thread.currentThread().getName() + " 】   客户端启动成功！！！");
        }

    }
}
