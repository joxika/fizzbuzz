package jony.fizzbuzz;

public class FizzBuzzApp {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(calculateOutput(i));
        }
    }

    public static String calculateOutput(int i) {
        if (i % (3*5) == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }


}
