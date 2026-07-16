import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class missing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        HashSet<Integer>num=new HashSet<>();
        int n=Collections.max(num);
        for(int i=0;i<n;i++){
            if(!num.contains(i)){
                System.out.println("missing number :"+i);
            }
        }
    }
}


