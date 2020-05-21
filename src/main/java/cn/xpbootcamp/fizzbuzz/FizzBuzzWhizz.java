package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzWhizz {
    public String reportNumber(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
