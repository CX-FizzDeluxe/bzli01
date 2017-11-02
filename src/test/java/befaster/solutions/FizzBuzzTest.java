package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {


    @Test
    public void fizzBuzz_0Returns0() {
        assertThat(FizzBuzz.fizzBuzz(0), is("0"));
    }

    @Test
    public void fizzBuzz_1Returns1() {
        assertThat(FizzBuzz.fizzBuzz(1), is("1"));
    }

    @Test
    public void fizzBuzz_3ReturnsFizz() {
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
    }

    @Test
    public void fizzBuzz_5ReturnsBuzz() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
    }


}