import java.util.Arrays;

public class Reverse {

    public static void main(String[] args){
        char[] arr={'h','a','r','s','h'};
        char[] arr2={'H','e','l','l','o'};
        Reverse.
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
        Reverse(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    public static void Reverse(char[] s){
        int left = 0;
        int right = s.length -1;
        while(left < right){
            char temp = s[left];
            s[left]= s[right];
            s[right]= temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(s));
    }
}