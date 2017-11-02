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
        assertThat(FizzBuzz.fizzBuzz(3), is("fizz fake deluxe"));
    }

    @Test
    public void fizzBuzz_5ReturnsBuzz() {
        assertThat(FizzBuzz.fizzBuzz(5), is("buzz fake deluxe"));
    }

    @Test
    public void fizzBuzz_9ReturnsFizz() {
        assertThat(FizzBuzz.fizzBuzz(9), is("fizz"));
    }

    @Test
    public void fizzBuzz_10ReturnsBuzz() {
        assertThat(FizzBuzz.fizzBuzz(10), is("buzz"));
    }

    @Test
    public void fizzBuzz_15ReturnsFizzBuzz() {
        assertThat(FizzBuzz.fizzBuzz(15), is("fizz buzz fake deluxe"));
    }

    @Test
    public void fizzBuzz_33ReturnsFizzFakeDeluxe() {
        assertThat(FizzBuzz.fizzBuzz(33), is("fizz fake deluxe"));
    }

    @Test
    public void fizzBuzz_36ReturnsFizzDeluxe() {
        assertThat(FizzBuzz.fizzBuzz(36), is("fizz deluxe"));
    }

    @Test
    public void fizzBuzz_50ReturnsBuzzDeluxe() {
        assertThat(FizzBuzz.fizzBuzz(50), is("buzz deluxe"));
    }

    @Test
    public void fizzBuzz_52ReturnsBuzz() {
        assertThat(FizzBuzz.fizzBuzz(52), is("buzz deluxe"));
    }

    @Test
    public void fizzBuzz_53ReturnsFizzBuzz() {
        assertThat(FizzBuzz.fizzBuzz(53), is("fizz buzz"));
    }

    @Test
    public void fizzBuzz_55ReturnsBuzzFakeDeluxe() {
        assertThat(FizzBuzz.fizzBuzz(55), is("buzz fake deluxe"));
    }

    @Test
    public void fizzBuzz_3510ReturnsFizzBuzzDeluxe() {
        assertThat(FizzBuzz.fizzBuzz(3510), is("fizz buzz deluxe"));
    }

    @Test
    public void fizzBuzz_135ReturnsFizzBuzzFakeDeluse() {
        assertThat(FizzBuzz.fizzBuzz(135), is("fizz buzz fake deluxe"));
    }
}