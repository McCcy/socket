package Service;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by ccy
 * 2018/4/28 11:22
 */
public class Client {
    public static void main(String[] args) {
        try {
//            162
            Socket socket = new Socket("10.90.102.162" , 9100);
//            String Str = "123456";
//            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            OutputStream ot = socket.getOutputStream();
            OutputStreamWriter writer = new OutputStreamWriter(ot,"GBK");
//            writer.write(27);
//            writer.write(64);
//
//            writer.write(28);
//            writer.write(33);
//            writer.write(8);
//
//            writer.write("好好");
//            writer.flush();
//            writer.write(28);
//            writer.write(33);
//            writer.write(0);
//
//            writer.write("意义");
//            writer.write(27);
//            writer.write(100);
//            writer.write(4);
//
//            writer.write(29);
//            writer.write(86);
//            writer.write(66);
//            writer.write(0);
            String a ="\u001B@\u001C!\u0008 好好\n\u001C! 意义\u001Bd\u0004\u001DVB ";
            writer.write(a);
//            writer.write("\u001B@asdasd\u001Bd\u0004\u001DVB ");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
