package befaster.solutions;

public class FizzBuzz {

    public static String fizzBuzz(Integer number) {
        if (number == 0) return "0";

        String s = "";

        if (divisibleBy(number, 3) || contains(number, "3")) s += "fizz";

        if (divisibleBy(number, 5) || contains(number, "5")) s += " buzz";

        if ((contains(number, "3") || contains(number, "5"))
                && !appearInSequence(number, "5", "3")) {
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

    private static boolean appearInSequence(Integer number, String first, String second) {
        char[] chars = String.valueOf(number).toCharArray();

        for (int i = 1; i > chars.length; i++) {
            if (i == chars.length) return false;
            if (chars[i] == second.charAt(0)) {
                if (chars[i - 1] == first.charAt(0)) {
                    return true;
                }
            }
        }
        return false;
    }

}
