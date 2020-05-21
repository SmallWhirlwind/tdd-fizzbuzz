package cn.xpbootcamp.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzWhizzTest {
    @Test
    void should_return_number_given_a_number_when_report_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String actualValue = fizzBuzzWhizz.reportNumber(1);

        Assertions.assertThat(actualValue).isEqualTo("1");
    }

    @Test
    void should_return_Fizz_given_a_number_is_3multiple_when_report_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String actualValue = fizzBuzzWhizz.reportNumber(3);

        Assertions.assertThat(actualValue).isEqualTo("Fizz");
    }

    @Test
    void should_return_Buzz_given_a_number_is_5multiple_when_report_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String actualValue = fizzBuzzWhizz.reportNumber(5);

        Assertions.assertThat(actualValue).isEqualTo("Buzz");
    }
}
