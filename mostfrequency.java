import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mostfrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer>map=new HashMap<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(i)==map.get(i+1)){
                c+=1;
            }
        }
        for(Integer i:map.keySet()){
            if(map.get(i)>c){
                System.out.println(i);
            
        }
    }
}
