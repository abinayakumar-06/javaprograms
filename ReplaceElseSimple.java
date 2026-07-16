public class ReplaceElseSimple {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int n=arr.length;
        int total=0;
        for(int num:arr){
            total+=num;
        }
        for(int i=0;i<n;i++){
            arr[i]=total-arr[i];
        }
        for (int num:arr){
            System.out.println(num+"");
        }
    }
    
}
