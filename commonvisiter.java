import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class commonvisiter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<String>a=new HashSet<>();
        Set<String>b=new HashSet<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            b.add(sc.nextInt());
        }
        for(int i:a){
            if(b.contains(i)){
                System.out.print(i+" ");
            }
        }
    }
}
