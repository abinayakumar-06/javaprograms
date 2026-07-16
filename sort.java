import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n= sc.nextInt();
        System.out.println("enter elements");
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        Collections.sort(num,Collections.reverseOrder());
        System.out.println(num);
    }
}
