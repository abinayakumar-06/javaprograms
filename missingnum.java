public class missingnum {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,7,8};
        int n=8;
        int a=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int miss=a-sum;
        System.out.print(miss);
    }
}
