package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if (number == 0) return "0";

        String s = "";

        if (number % 3 == 0 || String.valueOf(number).contains("3")) s += "fizz";
        if (number % 5 == 0 || String.valueOf(number).contains("5")) s += " buzz";
        if (isDeluxe(number) && number % 2 == 0) s += " deluxe";
        if (isDeluxe(number) && number % 2 == 1) s += " fake deluxe";

        return s.isEmpty()? String.valueOf(number) : s.trim();
    }

    private static boolean isDeluxe(Integer number) {
        return (number > 10 && numbersAreIdentical(number));
    }

    private static boolean numbersAreIdentical(Integer number) {
        char[] chars = String.valueOf(number).toCharArray();

        for (char c : chars) {
            if (c != chars[0]) return false;
        }
        return true;
    }

}
