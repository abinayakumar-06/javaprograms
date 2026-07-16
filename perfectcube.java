import java.util.Scanner;
public class perfectcube {
    static boolean isperfectcube(int n){
        int cube=(int)Math.round(Math.cbrt(n));
        return((cube*cube*cube)==n);
    }
    public static void main(String[]args){
        int n = new Scanner (System.in).nextInt();
        if(isperfectcube(n))
            System.out.println("perfect cube");
        else
            System.out.println("not perfect cube");
    }
    
}
