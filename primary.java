import java.util.Scanner;
public class primary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] arr=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();

            }
            
        }      
    
            for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i+j==arr.length-1){

                    System.out.println(arr[j][j]+" ");

        }
    }}}}