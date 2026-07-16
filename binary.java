import java.util.*;
public class binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int key=3;
        int l=0;
        int r=arr.length;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==key){
                System.out.println("found"+mid);
                return;
            }
            else if (arr[mid]<key){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
    }
}
