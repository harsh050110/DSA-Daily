public class D7 {
    public static void main(String[] args){
        pattern1(4);
        pattern2(7);
        pattern3(5);
        pattern4(6);
    }
    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            
            System.out.println();
        }

    }
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }
    
}
