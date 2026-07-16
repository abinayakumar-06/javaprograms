import java.util.HashMap;
import java.util.Scanner;

public class mergetwostudent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String>str=new HashMap<>();
        HashMap<Integer,String>str1=new HashMap<>();
        int size=sc.nextInt();
        int size1=sc.nextInt();
        for(int i=0;i<size;i++){
            int k=sc.nextInt();
            String v=sc.next();
            str.put(k,v);
        }
        for(int i=0;i<size1;i++){
            int k1=sc.nextInt();
            String v1=sc.next();
            str1.put(k1,v1);
        }
        str.putAll(str1);
        System.out.println(str);  
    }
}
