package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzWhizz {
    public String reportNumber(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
