package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrengthTest {
    static int counter = 0;

    @ParameterizedTest
    @DisplayName("Password Strengths")
    @ValueSource(strings = {"1234", "idk", "aslkdjfioawe"})
    public void passwordStrength(String testPass){
        assertEquals(PasswordStrength.passwordValidator(testPass), counter);
        counter++;
    }
}
