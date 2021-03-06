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

    @Test
    void should_return_Whizz_given_a_number_is_7multiple_when_report_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String actualValue = fizzBuzzWhizz.reportNumber(7);

        Assertions.assertThat(actualValue).isEqualTo("Whizz");
    }

    @Test
    void should_return_FizzBuzz_given_a_number_is_3_and_5multiple_when_report_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String actualValue = fizzBuzzWhizz.reportNumber(15);

        Assertions.assertThat(actualValue).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_FizzWhizz_given_a_number_is_3_and_7multiple_when_report_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String actualValue = fizzBuzzWhizz.reportNumber(21);

        Assertions.assertThat(actualValue).isEqualTo("FizzWhizz");
    }

    @Test
    void should_return_BuzzWhizz_given_a_number_is_5_and_7multiple_when_report_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String actualValue = fizzBuzzWhizz.reportNumber(70);

        Assertions.assertThat(actualValue).isEqualTo("BuzzWhizz");
    }

    @Test
    void should_return_FizzBuzzWhizz_given_a_number_is_3_and_5_and_7multiple_when_report_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        String actualValue = fizzBuzzWhizz.reportNumber(105);

        Assertions.assertThat(actualValue).isEqualTo("FizzBuzzWhizz");
    }
}
