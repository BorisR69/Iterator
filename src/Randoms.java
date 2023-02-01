import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int diff;
    int minRandom;

    public Randoms(int min, int max) {
        diff = max - min;
        minRandom = min;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }
            @Override
            public Integer next() {
                int i = random.nextInt(diff + 1);
                i += minRandom;
                return i;
            }
        };
    }
}