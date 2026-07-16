public class crosspattern {
    public static void main(String[] args) {
        int n1=5;
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1;j++){
                if(j==1||j==(n1-i+1))
                System.out.print("*");
                else
                System.out.print(" ");    
            }
            System.out.println();
        }
    }
}
