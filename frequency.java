import java.util.HashMap;
import java.util.Scanner;

public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(Integer num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println(map.entrySet());
    }
}

