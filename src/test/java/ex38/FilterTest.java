package ex38;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTest {
    @Test
    public void filter_test(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        List<Integer> filtered = FilteringValues.filter(numbers);
        for (int i : filtered) {
            assertEquals(0, i % 2);
        }
    }
}
