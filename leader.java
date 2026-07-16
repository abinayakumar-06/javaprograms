import java.util.ArrayList;
import java.util.Scanner;

public class leader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer> num=new ArrayList<>();
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        boolean lead;
        for(int j=0;j<n;j++){
            lead=true;
            for(int k=j+1;k<n;k++){
            
            if(lead){
                System.out.print(num.get(j));
            }
        }
    }
}
