import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n= sc.nextInt();
        int m= sc.nextInt();
        System.out.println("enter elements");
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Integer> num1=new ArrayList<>();
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            num.add(sc.nextInt());
        }
        num.addAll.num1();
        System.out.print(num);
    }
}