import java.util.*;

public class D5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5;

        for (int i = 1; i <= n; i++) {
            String pattern = "";

            for (int j = 1; j <= i; j++) {
                pattern += "$";
            }

            System.out.println(pattern);
        }
    }
}