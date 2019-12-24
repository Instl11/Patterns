package patterns.streamHomework.conc_test;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Volot {
    public static void main(String[] args) throws InterruptedException {

        Connection connection = Connection.getConnection(6);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 1000; i++) {
            executorService.submit(connection::connect);
        }
        executorService.shutdown();
        executorService.awaitTermination(1000, TimeUnit.SECONDS);
    }

}

class Connection {
    private static Connection connection = null;
    private static Semaphore semaphore;
    private static AtomicInteger number = new AtomicInteger();

    private Connection(int semaphorePermits) {
        semaphore = new Semaphore(semaphorePermits);
    }

    public static Connection getConnection(int permits) {
        if (connection == null){
            connection = new Connection(permits);
        }
        return connection;
    }

    public void connect(){
        try {
            semaphore.acquire();
            System.out.println(number.incrementAndGet());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}


