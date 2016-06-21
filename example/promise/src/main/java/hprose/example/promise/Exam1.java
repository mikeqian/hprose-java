package hprose.example.promise;

import hprose.util.concurrent.Action;
import hprose.util.concurrent.Promise;

import java.util.concurrent.Callable;

/**
 * 将异步的call的返回值输出到xxx。
 */
public class Exam1 {
    public static void main(String[] args) throws InterruptedException {
        /**
         * Promise定义中包含一个runable的task
         */
        Promise<String> promise = new Promise<String>(new Callable<String>() {
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getId());
                Thread.sleep(1000 * 1);
                return "hprose";
            }
        });

        Thread.sleep(1000 * 2);

        /**
         * Then的时候去执行runable的task,执行完后再执行回掉函数
         */
        promise.then(new Action<String>() {
            public void call(String value) throws Throwable {
                System.out.println(Thread.currentThread().getId());
                System.out.println(value);
                Thread.sleep(1000 * 1);
            }
        });
    }
}
