import java.util.ArrayList;
import java.util.Scanner;

public class seatnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n= sc.nextInt();
        System.out.println("enter elements");
        ArrayList<String> str=new ArrayList<>();
        for(int i=0;i<n;i++){
            str.add(sc.next());
        }
        System.out.println("enter index");
        int index=sc.nextInt();
        System.out.println(str.get(1));
    }
}
