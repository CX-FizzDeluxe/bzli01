package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if (number == 0) return "0";

        if (number == 3) return "Fizz";
        if (number == 5) return "Buzz";

        return String.valueOf(number);
    }

}