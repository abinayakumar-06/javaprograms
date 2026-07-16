import java.util.*;
public class rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        
    }
    Collections.rotate(num, 1);
    System.out.println(num);

}}

