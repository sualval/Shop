import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class Shop implements Callable<List<Integer>> {

    @Override
    public List<Integer> call() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(new Random().nextInt(100));
        }
        return list;
    }
}
