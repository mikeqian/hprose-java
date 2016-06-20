package hprose.example.promise;

import hprose.util.concurrent.Action;
import hprose.util.concurrent.Promise;

import java.util.concurrent.Callable;

public class Exam2 {
    public static void main(String[] args) {
        /**
         * task抛出了异常
         */
        Promise<?> promise = new Promise(new Callable() {
            public Object call() throws Exception {
                throw new Exception("hprose");
            }
        });
        /**
         * 执行task,并将异常打印出来
         */
        promise.catchError(new Action<Throwable>() {
            public void call(Throwable value) throws Throwable {
                System.out.println(value);
            }
        });
    }
}