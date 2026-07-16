import java.util.HashMap;
import java.util.Scanner;

public class mark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            String name=sc.next();
            int mark=sc.nextInt();
            map.put(name,mark);
        }
        String nam=sc.next();
        System.out.println(map.get(nam));

    }
}
