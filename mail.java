import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class mail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> input = new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            input.add(sc.next());
        }
        System.out.println(input.size());
        }
       
}

