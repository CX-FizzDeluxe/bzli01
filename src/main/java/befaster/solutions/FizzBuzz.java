package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if (number == 0) return "0";

        String s = "";

        if (number % 3 == 0) s += "fizz ";
        if (number % 5 == 0) s += "buzz";

        return s.isEmpty()? String.valueOf(number) : s.trim();
    }

}
