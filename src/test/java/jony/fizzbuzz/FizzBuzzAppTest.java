package jony.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzAppTest {

    @Test
    public void testFizz(){
        assertEquals(FizzBuzzApp.calculateOutput(3),"Fizz");
    }

    @Test
    public void testBuzz(){
        assertEquals(FizzBuzzApp.calculateOutput(5),"Buzz");
    }

    @Test
    public void testFizzBuzz(){
        assertEquals(FizzBuzzApp.calculateOutput(15),"FizzBuzz");
    }

    @Test
    public void testNumber(){
        assertEquals(FizzBuzzApp.calculateOutput(1),"1");
    }

}