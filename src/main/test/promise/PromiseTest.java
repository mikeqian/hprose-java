package promise;

import hprose.util.concurrent.Action;
import hprose.util.concurrent.Promise;
import org.junit.Test;

import java.util.concurrent.Callable;

/**
 * Created by luhan.qian on 2016/6/21.
 */
public class PromiseTest {

    @Test
    public void createPromise() throws InterruptedException {
        //promise是对可执行Callable的包装
        Promise<String> promise = new Promise<String>(
                new Callable<String>() {
                    public String call() throws Exception {
                        //停止30秒
                        Thread.sleep(1000 * 3);
                        System.out.println(Thread.currentThread().getId());
                        return "fuck";
                    }
                }
        );

        promise.then(new Action<String>() {
            public void call(String value) throws Throwable {
                System.out.println(Thread.currentThread().getId());
                System.out.println(value);
            }
        });

        Thread.sleep(1000 * 10);
    }
}
