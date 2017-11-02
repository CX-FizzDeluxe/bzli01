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
        assertThat(FizzBuzz.fizzBuzz(3), is("fizz"));
    }

    @Test
    public void fizzBuzz_5ReturnsBuzz() {
        assertThat(FizzBuzz.fizzBuzz(5), is("buzz"));
    }

    @Test
    public void fizzBuzz_6ReturnsFizz() {
        assertThat(FizzBuzz.fizzBuzz(6), is("fizz"));
    }

    @Test
    public void fizzBuzz_10ReturnsBuzz() {
        assertThat(FizzBuzz.fizzBuzz(10), is("buzz"));
    }

    @Test
    public void fizzBuzz_15ReturnsFizzBuzz() {
        assertThat(FizzBuzz.fizzBuzz(15), is("fizz buzz"));
    }

    @Test
    public void fizzBuzz_31ReturnsFizz() {
        assertThat(FizzBuzz.fizzBuzz(31), is("fizz"));
    }

    @Test
    public void fizzBuzz_52ReturnsBuzz() {
        assertThat(FizzBuzz.fizzBuzz(52), is("buzz"));
    }

    @Test
    public void fizzBuzz_53ReturnsBuzz() {
        assertThat(FizzBuzz.fizzBuzz(53), is("fizz buzz"));
    }


    @Test
    public void fizzBuzz_53ReturnsBuzz() {
        assertThat(FizzBuzz.fizzBuzz(53), is("fizz buzz"));
    }

}