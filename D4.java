import java.util.*;
public class D4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of apples: ");
        int apples = scanner.nextInt();


        if(apples %4==0){
            System.out.println("the apples can be distributed in equally amoung all the students");
        
        }else{
            System.out.println("Some are left there.");
        }
        scanner.close();
    }
}
