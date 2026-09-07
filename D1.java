import java.util.*;

public class D1 {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 3, 5, 5, 7};
        int duplicate =-1;

        for(int i=0; i<arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    duplicate = arr[i];
                    break;
                }
            }
            if(duplicate != -1){
                break;
            }
        }
        System.out.println("Duplicate: "+duplicate);
    }
    
}
