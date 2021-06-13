package ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Doherty
 */

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Ex24Test {
    @Test
    @DisplayName("isAnagram: same string")
    public void same_string() {
        boolean test = AnagramChecker.isAnagram("racecar", "racecar");
        assertTrue(test);
    }
    @Test
    @DisplayName("isAnagram: not anagram")
    public void not_anagram(){
        assertFalse(AnagramChecker.isAnagram("cat", "dog"));
    }
    @Test
    @DisplayName("isAnagram: anagram")
    public void anagram(){
        assertTrue(AnagramChecker.isAnagram("fido", "difo"));
    }
}
