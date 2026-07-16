public class boundry {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==5){
                    continue;
                }
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.println();
        }
        System.out.print("sum= "+sum);
                }
            }
