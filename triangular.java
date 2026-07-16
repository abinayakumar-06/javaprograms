import java.util.Scanner;

public class triangular {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number:");
        int n= sc.nextInt();
        int sum =0;
        for(int i=1;sum<n;i++)
            sum+=i;
            if(sum==n)
            System.out.println("triangular number");
            else
            System.out.println("not triangular number");
    }
}
