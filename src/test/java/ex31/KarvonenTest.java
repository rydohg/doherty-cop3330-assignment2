package ex31;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KarvonenTest {
    @Test
    public void karvonen_test(){
        assertEquals(KarvonenHeart.rateTable(65, 22),
                "55%       | 138 bpm\n" +
                "60%       | 145 bpm\n" +
                "65%       | 151 bpm\n" +
                "70%       | 158 bpm\n" +
                "75%       | 165 bpm\n" +
                "80%       | 171 bpm\n" +
                "85%       | 178 bpm\n" +
                "90%       | 185 bpm\n" +
                "95%       | 191 bpm\n");
    }
}
