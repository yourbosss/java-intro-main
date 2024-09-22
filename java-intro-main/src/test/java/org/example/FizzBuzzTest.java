package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        assertEquals("fizz", FizzBuzz.fizzBuzz(5)); //при передаче числа 5 метод вернет строку "fizz".
        assertEquals("buzz", FizzBuzz.fizzBuzz(7)); // Ожидается, что при передаче числа 7 метод вернет строку "buzz".
        assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(35)); //Ожидается, что при передаче числа 35 метод вернет строку "fizzbuzz".
        assertEquals("1", FizzBuzz.fizzBuzz(1)); //етод будет возвращать строковые представления
        // чисел (например, "1", "2", "3" и т.д.) для чисел, не кратных 3 или 5.
        assertEquals("2", FizzBuzz.fizzBuzz(2));
        assertEquals("3", FizzBuzz.fizzBuzz(3));
        assertEquals("4", FizzBuzz.fizzBuzz(4));
        assertEquals("6", FizzBuzz.fizzBuzz(6));
        assertEquals("8", FizzBuzz.fizzBuzz(8));
        assertEquals("9", FizzBuzz.fizzBuzz(9));
        assertEquals("fizz", FizzBuzz.fizzBuzz(10));
        assertEquals("buzz", FizzBuzz.fizzBuzz(14));
    }
}
