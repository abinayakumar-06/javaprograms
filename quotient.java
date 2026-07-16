public class quotient {
    public static void main(String[] args) {
        int a=20,b=4;
        int quotient=0;
        while(a>=b){
            a=a-b;
            quotient++;
        }
        System.out.println("quotient="+quotient);
    }
}
