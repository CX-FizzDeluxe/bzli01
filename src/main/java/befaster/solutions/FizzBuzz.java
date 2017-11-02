package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if (number == 0) return "0";

        String s = "";

        if (divisibleBy(number, 3) || contains(number, "3")) s += "fizz";
        if (divisibleBy(number, 5) || contains(number, "5")) s += " buzz";


        return s.isEmpty()? String.valueOf(number) : s.trim();
    }


    private static boolean divisibleBy(Integer number, Integer divideBy) {
        return number % divideBy == 0;
    }

    private static boolean contains(Integer number, String s) {
        return String.valueOf(number).contains(s);
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