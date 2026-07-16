import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class railway {
    public static void main(String[] args) {
        TreeSet<Integer>scores=new TreeSet<>();
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=0;i<n;i++){
            scores.add(Sc.nextInt());
        }
        int m=(Collections.min(scores));
        System.out.println(m);
        System.out.println("remaining seats");
        for(int i:scores){
            if(i>m){
                System.out.println(i);
            }
        }
    }
}
