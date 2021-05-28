import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzGameTests {

    private FizzBuzzGame underTest;

    @BeforeEach
    private void setUp(){
        underTest = new FizzBuzzGame();
    }

    @Test
    public void shouldInstantiateObject(){
        underTest = new FizzBuzzGame();
    }

    @Test
    public void shouldReturnOneIfGivenOne(){
        assertEquals("1", underTest.fizzBuzz(1));
    }

    @Test
    public void shouldReturnTwoIfGivenTwo(){
        assertEquals("2", underTest.fizzBuzz(2));
    }

    @Test
    public void shouldReturnFizzIfGivenMultipleOfThree(){
        assertAll(
                () -> assertEquals("Fizz", underTest.fizzBuzz(3)),
                () -> assertEquals("Fizz",underTest.fizzBuzz(6)),
                () -> assertEquals("Fizz", underTest.fizzBuzz(9))
        );
    }

    @Test
    public void shouldReturnFizzIfGivenMultipleOfFive(){
        assertAll(
                () -> assertEquals("Buzz", underTest.fizzBuzz(5)),
                () -> assertEquals("Buzz",underTest.fizzBuzz(20)),
                () -> assertEquals("Buzz", underTest.fizzBuzz(25))
        );
    }

    @Test
    public void shouldReturnFizzIfGivenMultipleOfThreeAndFive(){
        assertAll(
                () -> assertEquals("FizzBuzz", underTest.fizzBuzz(15)),
                () -> assertEquals("FizzBuzz", underTest.fizzBuzz(30)),
                () -> assertEquals("FizzBuzz", underTest.fizzBuzz(45))
        );
    }
}
