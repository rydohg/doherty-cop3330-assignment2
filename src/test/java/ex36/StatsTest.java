package ex36;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsTest {
    @Test
    public void stats_test(){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            nums.add(i);
        }
        assertEquals(ComputingStats.avg(nums), 5.5);
        assertEquals(ComputingStats.min(nums), 1);
        assertEquals(ComputingStats.max(nums), 10);
        assertEquals(ComputingStats.stdDev(nums, ComputingStats.avg(nums)), 2.87, .01);
    }
}
