/**
 * @author coryjia@gmail.com
 * @date 4/10/20 8:14 PM
 */
public class Temp {
    public static void main(String[] args) {
        new Thread(new Runnable() {//接口类
            @Override
            public void run() { // 方法名
                System.out.println("Thread run()");
            }
        }).start();
    }
}

