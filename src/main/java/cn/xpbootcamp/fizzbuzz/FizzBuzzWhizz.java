package cn.xpbootcamp.fizzbuzz;

public class FizzBuzzWhizz {
    public String reportNumber(int number) {
        StringBuilder reportNumber = new StringBuilder();
        if (number % 3 == 0) {
            reportNumber.append("Fizz");
        }
        if (number % 5 == 0) {
            reportNumber.append("Buzz");
        }
        if (number % 7 == 0) {
            reportNumber.append("Whizz");
        }
        return reportNumber.length() > 0 ? reportNumber.toString() : String.valueOf(number);
    }
}
