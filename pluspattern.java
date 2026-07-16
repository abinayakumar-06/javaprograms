public class pluspattern {
    public static void main(String[] args) {
        int mid = 5/2;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==mid+1 || j==mid+1)
                    System.out.print("*");   
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}               
    