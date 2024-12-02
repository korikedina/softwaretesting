package uni.sw.unit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FibonacciTest {
    @Test
    public void mockTest(){
        Fibonacci fibonacci=mock(Fibonacci.class);
        when(fibonacci.Fibonacci(15)).thenReturn(610);
        when(fibonacci.Fibonacci(20)).thenReturn(6765);

        assertEquals(610, fibonacci.Fibonacci(15), "fibonacci.Fibonacci(15) should return 610");
        assertEquals(6765, fibonacci.Fibonacci(20), "fibonacci.Fibonacci(20) should return 6765");
    }

    public void fibonacciTest(){
        Fibonacci fibonacci=new Fibonacci();
        assertEquals(21, fibonacci.Fibonacci(8), "The 8. Fibonacci number is 21");
        assertEquals(28657, fibonacci.Fibonacci(23), "The 23. Fibonacci number is 28657");
    }
}
