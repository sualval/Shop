import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executors = Executors.newFixedThreadPool(3);
        LongAdder longAdder = new LongAdder();
        executors.submit(new Shop()).get().forEach(longAdder::add);
        executors.submit(new Shop()).get().forEach(longAdder::add);
        executors.submit(new Shop()).get().forEach(longAdder::add);
        System.out.println(longAdder.sum());
        executors.shutdown();
    }
}
