package ex29;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class BadInputTest {
    @Test
    public void badInputTest(){
        ByteArrayInputStream inputStream = new ByteArrayInputStream("0\n1\n".getBytes());
        System.setIn(inputStream);
    }
}
