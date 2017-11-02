package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if (number == 0) return "0";

        String s = "";

        if (divisibleBy(number, 3) || contains(number, "3")) s += "fizz";

        if (divisibleBy(number, 5) || contains(number, "5") ) s += " buzz";

        if ((contains(number, "3") || contains(number, "5"))
                && !(contains(number, "3") && contains(number, "5"))) {
            if (!divisibleBy(number, 2)) {
                s += " fake deluxe";
            } else {
                s += " deluxe";
            }
        }

        return s.isEmpty() ? String.valueOf(number) : s.trim();
    }


    private static boolean divisibleBy(Integer number, Integer divideBy) {
        return number % divideBy == 0;
    }

    private static boolean contains(Integer number, String s) {
        return String.valueOf(number).contains(s);
    }

}
