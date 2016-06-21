package tcp;

import hprose.common.HproseException;
import hprose.server.HproseTcpServer;
import hprose.server.ServiceContext;
import hprose.util.concurrent.Promise;

import java.io.IOException;
import java.net.URISyntaxException;

public class TCPHelloServer {
    public static Promise hello(String name, ServiceContext context) throws HproseException {
        context.clients.push("news", "this is a pushed message: " + name);
        return Promise.value("Hello " + name + "!");
    }

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
        HproseTcpServer server = new HproseTcpServer("tcp://localhost:4321");
        server.setReactorThreads(2);

        server.add("hello", TCPHelloServer.class);
        server.setDebugEnabled(true);
        server.publish("news");
//        server.setEnabledThreadPool(true);
//        ExecutorService pool = Executors.newFixedThreadPool(2);
//        server.setThreadPool(pool);
        server.start();
        System.out.println("START");
        System.in.read();
        server.stop();
        System.out.println("STOP");
        //pool.shutdown();
    }
}
