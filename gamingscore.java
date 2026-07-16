import java.util.*;
public class gamingscore {
    public static void main(String[]args){
        TreeSet<Integer>scores=new TreeSet<>();
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        for(int i=0;i<n;i++){
            scores.add(Sc.nextInt());
        }
                
        System.out.println(scores);
        System.out.println(Collections.max(scores));
        System.out.println(Collections.min(scores));

    }
}
