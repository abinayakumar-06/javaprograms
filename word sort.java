import java.util.*;
public class Wordsort{
    public static void main(String[]args){
        int [] arr1={3,5,8,6,7};
        int [] arr2={16,21,25,9,13};
        int [] ans=new int[arr1.length+arr2.length];
        int ind=0;
        for(int i=0;i<arr1.length;i++){
            ans[ind]=arr1[i];
            ind++;
        }
        for(int i=0;i<arr2.length;i++){
            ans[ind]=arr2[i];
            ind++;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }    
}
