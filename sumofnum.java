import java.util.*;
public class sumofnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum =sumofnum(n);
        System.out.println(sumofnum(n));
        
    }
    public static int sumofnum(int n){
        if(n==1)
            return n;
        else
            return n+sumofnum(n-1);
    }
}
