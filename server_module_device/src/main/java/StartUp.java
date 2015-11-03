import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by weixuan on 2015/10/26.
 */
public class StartUp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"device-applicationContext.xml"});
        context.start();
        System.out.println("service device start");
        synchronized (StartUp.class) {
            while (true) {
                try {
                    StartUp.class.wait();
                } catch (Throwable e) {
                }
            }
        }
    }
}
