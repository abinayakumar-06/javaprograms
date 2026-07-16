import java.util.LinkedHashSet;
import java.util.Scanner;

public class linkedhashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedHashSet<Integer> s=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            s.add(sc.nextInt());
        }
        System.out.println(s);
    }
}
