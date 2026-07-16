public class sumofdiagonal{
    public static void main(String[]args){
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j][j];
        }
        System.out.println("total sum of diagonal is" +sum);
    }
}
    

