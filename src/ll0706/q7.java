package ll0706;

import java.util.Arrays;

class q7 {
    static String s = "30 + 40 + 20 + 40 + 20 + 50 + 11 + -6  + -100";
    //105 나와야함

    public static void main(String[] args) {
        sol1();
    }
    private static void sol1() {
        s = s.replace(" ", "");

        int pos_sum = Arrays
                .stream(s.split("\\+"))
                .filter((s) -> s.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();

        int neg_sum = Arrays
                .stream(s.split("\\+"))
                .filter((s) -> s.matches("-\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();

        System.out.println(pos_sum+neg_sum);
    }

}