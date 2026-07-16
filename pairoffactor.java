public class pairoffactor {
    public static void main(String[] args) {
        int n = 100;
        for (int i= 1;i<100;i++)
            if(n%i==0){
                int res=n/i;
                System.out.println(i + " * " + res+" = "+(i*res));
            }    
    }
}


