public class D2 {
    public static void main (String[] args){
        int n = 5;
        for(int i=1; i<=n; i++){
            String pattern = "";
            for (int j=1; j<=i; j++){
                pattern += "*";
            }
            System.out.println(pattern);
        }
    }
    
}
