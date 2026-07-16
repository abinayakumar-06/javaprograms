public class oddeven {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int even=0;
        int odd=0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]%2==0){
                even+=1;
            }
            else{
                odd+=1;
            }
        }
        System.out.println("even count"+even);
        System.out.println("odd count"+odd);
        
    }
}
