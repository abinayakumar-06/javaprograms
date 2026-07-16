import java.util.*;
public class sumofoddnum {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sumof(arr,0));    
    }
    public static int sumof(int[]arr,int ind){
        if(ind>=arr.length)
        {
            return 0;
        }
        int sum=(arr[ind]%2!=0)?arr[ind]:0;
        return sum+sumof(arr,ind+1);
    }
}
