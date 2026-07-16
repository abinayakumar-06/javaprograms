import java.util.*;
public class array {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int[] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    int ele=sc.nextInt();
    int pos=sc.nextInt();
    for(int i=0;i<arr.length+1;i++) {
        int ans[]=new int[arr.length+1];
        if(i<pos) {
            ans[i]=arr[i];
        }
        else if(i==pos){
            ans[i]=ele;
        }
        else if(i>pos){
                ans[i]=arr[i-1];
            }
        System.out.print(ans[i]+" ");
            }   
        }        
    }
    