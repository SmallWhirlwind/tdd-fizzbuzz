package cn.xpbootcamp.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzWhizzTest {
    @Test
    void should_return_number_given_a_number_when_report_number() {
        FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

        int actualValue = fizzBuzzWhizz.reportNumber(1);

        Assertions.assertThat(actualValue).isEqualTo(1);
    }
}
