package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {


    @Test
    public void fizzBuzz_0Returns0() {
        assertThat(FizzBuzz.fizzBuzz(0), is("0"));
    }

}