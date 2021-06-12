package ex27;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class InputVerifyTest {
    @Test
    @DisplayName("Employee Test")
    public void employee_test(){
        assertEquals(InputValidator.employeeVerify("AA-12345"), "");
        assertNotEquals(InputValidator.employeeVerify("AA-1234"), "");
        assertNotEquals(InputValidator.employeeVerify("AA-1a345"), "");
        assertNotEquals(InputValidator.employeeVerify("aa-12345"), "");
    }
}
