import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    @Test
    @DisplayName("두 정수를 이용하여 덧셈을 할 경우 그에 해당하는 올바른 결과가 나와야 한다.")
    public void testAddition() {
        assertEquals(310, Calculator.add(105, 205), "덧셈 결과가 일치하지 않습니다.");
    }

    @Test
    @DisplayName("두 정수를 이용하여 뺄셈을 할 경우 그에 해당하는 올바른 결과가 나와야 한다.")
    public void testSubtraction() {
        assertEquals(240, Calculator.subtract(48, -192), "뺄셈 결과가 일치하지 않습니다.");
    }

    @Test
    @DisplayName("두 정수를 이용하여 곱셈을 할 경우 그에 해당하는 올바른 결과가 나와야 한다.")
    public void testMultiplication() {
        assertEquals(1000, Calculator.multiply(8, 125), "곱셈 결과가 일치하지 않습니다.");
    }

    @Test
    @DisplayName("두 정수를 이용하여 정수 나눗셈을 진행할 경우 그에 해당하는 올바른 결과가 나와야 한다.")
    public void testDivision() {
        assertEquals(25, Calculator.divide(177, 7), "나눗셈 결과가 일치하지 않습니다.");
    }

    @Test
    @DisplayName("0으로 나누는 경우에는 예외를 발생시켜야 하며, 0으로 나눠서는 안 된다는 메시지를 전달해야 한다.")
    public void testDivisionByZeroWithErrorMessage() {
        ArithmeticException exception = assertThrows(ArithmeticException.class,
                () -> Calculator.divide(15, 0),
                "0으로 나눌 경우 ArithmeticException이 발생해야 하지만, 해당 에러가 발생하지 않았습니다.");
        assertEquals("0으로 나눌 수 없습니다.",
                exception.getMessage(),
                "0으로 나누었을 때 발생하는 에러 메시지의 내용이 일치하지 않습니다.");
    }
}
