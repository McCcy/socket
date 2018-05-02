/**
 * Created by ccy
 * 2018/4/28 11:02
 */
public class Mian {

    public static void main(String[] args) {
        Runnable runnable = new ClintRunnable();
        Thread t1 = new Thread(runnable);
        t1.start();
//        ConnectionManageImpl connectionManage = new ConnectionManageImpl();
//        SocketConnection socketConnection  = connectionManage.getSocketConnection("1");
//        Message message = new MessageTemplate("1");
//        Map<String,String> dataMap = new HashMap<String, String>();
//        dataMap.put("name","ccy");
//        dataMap.put("age","18");
//        socketConnection.sendMsg(message.getText(dataMap));
    }
}
