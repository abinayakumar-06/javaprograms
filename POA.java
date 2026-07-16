import java.util.*;
public class POA {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int product=1;
        for(int num :arr){
            product*=num;
        }
        for (int i=0;i<arr.length;i++){
            arr[i]=product/arr[i];
        }
    System.out.println("product of an array is"+product);
    System.out.println("the array is ");
    for (int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
}
