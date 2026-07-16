import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class roll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Set<String>a=new HashSet<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            a.add(sc.next());
        }
        if(n==a.size()){
            System.out.println("no duplicates");
        }
        else{
            System.out.println("duplicates found");
        }
    }
}
