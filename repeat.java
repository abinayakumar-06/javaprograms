import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class repeat {
    public static void main(String[] args) {
        HashSet<Integer>num=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            if(num.contains(value)){
                System.out.println("Repeating number"+value);
                break;
            }else{
                num.add(value);
            }
        }
    }
}
