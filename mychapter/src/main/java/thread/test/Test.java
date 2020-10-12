package thread.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Gy
 * @description
 * @created 2020/9/28
 */
public class Test {
    static Logger logger = LoggerFactory.getLogger(Test.class);

    class T extends Thread {
        public void run() {
            logger.info("11111");
            System.out.println("thread");
        }
    }

    class R implements Runnable {
        public void run() {
            System.out.println("runnable");
        }
    }

    static class C implements Callable<String> {
        public String call() {
            logger.info("callable");
            return "call";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> task = new FutureTask<>(new C());
        Thread thread = new Thread(task);
        thread.start();
        System.out.println(task.get());
    }

}
