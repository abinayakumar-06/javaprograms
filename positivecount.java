import java.util.ArrayList;
import java.util.Scanner;

public class positivecount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n= sc.nextInt();
        System.out.println("enter elements");
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(num.get(i)<0){
                count++;
            }
        }
        System.out.println(count);
    }
}
