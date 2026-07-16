import java.util.Scanner;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer>m=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            m.add(sc.nextInt());
        }
        System.out.println(m);
    }
}