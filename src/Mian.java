/**
 * Created by ccy
 * 2018/4/28 11:02
 */
public class Mian {
    public static void main(String[] args) {
        Runnable runnable = new ClintRunnable();
        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
