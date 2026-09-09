public class D9 {
    public static void main(String[] args){
        pattern1(4);
        pattern2(5);
        pattern3(4);
        pattern4(6);
        pattern5(2);
        pattern6(7);
        pattern7(4);

    }
    static void pattern1(int n){
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4; j++){
                System.out.print("*");
        
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    // star =5-i;
    static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print("&");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n*2; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
