package ex37;

import org.junit.jupiter.api.Test;

public class PassTest {
    @Test
    public void pass_test(){
        String pass = PassGenerator.generatePass(8, 2, 2);
    }
}
