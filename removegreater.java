import java.util.Scanner;
import java.util.TreeSet;

public class removegreater {
    public static void main(String[] args) {
        TreeSet<Integer>m=new TreeSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            m.add(sc.nextInt());
        }
        for(int i:m){
            if(i<15){
                System.out.println(i);

        }

        }
    }
}
