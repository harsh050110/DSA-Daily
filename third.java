import java.util.Arrays;
public class third {
    public static void main(String[] args) {
        third t = new third();
        int[] arr = {1, 3, 5, 7, 9};
        int result = t.thirdMax(arr);
        System.out.println(result);
    }

    public int thirdMax(int[] nums) {
        Long first = Long.MIN_VALUE;
        Long second = Long.MIN_VALUE;
        Long third = Long.MIN_VALUE;

        for (int n : nums) {
            if (n == first || n == second || n == third) {
                continue; 
            }

            if (n > first) {
                third = second;
                second = first;
                first = (long) n;
            } else if (n > second) {
                third = second;
                second = (long) n;
            } else if (n > third) {
                third = (long) n;
            }
        }

        return (third == Long.MIN_VALUE) ? first.intValue() : third.intValue();
    }
}
