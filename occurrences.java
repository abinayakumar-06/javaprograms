import java.util.Scanner;

public class occurrences {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int countDigits = 0;
        int countTwos = 0;

        int n = Math.abs(num); 

        while (n > 0) {
            int digit = n % 10;  
            countDigits++;        

            if (digit == 2) 
                countTwos++;      
            n = n / 10;          
        }
        System.out.println("Number of digits = " + countDigits);
        System.out.println("Occurrences of digit = " + countTwos);
    }
}