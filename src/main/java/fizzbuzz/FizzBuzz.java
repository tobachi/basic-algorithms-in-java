import java.util.Objects;

public class FizzBuzz {

    public static void main(String[] args) {
        int input = 100;
        
        // fizzbuzz1(input);
        fizzbuzz2(input);
    }

    private static void fizzbuzz1(int input) {
        for (int i = 1; i <= input; i++) {
            String result = Objects.toString(i);
            if (i % 15 == 0) {
                result = "fizzbuzz";
            } else if (i % 3 == 0) {
                result = "fizz";
            } else if (i % 5 == 0) {
                result = "buzz";
            }
            System.out.println(Objects.toString(i) + ": " + result);
        }
    }

    private static void fizzbuzz2(int input) {
        for (int i = 1; i <= input; i++) {
            String result = "";
            if (i % 3 == 0) result += "fizz";
            if (i % 5 == 0) result += "buzz";
            if (result == "") result = Objects.toString(i);
            System.out.println(Objects.toString(i) + ": " + result);
        }
    }

}
