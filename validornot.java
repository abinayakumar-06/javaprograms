import java.util.*;
public class validornot {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()>=6){
            System.err.println("valid");
        }
        else{
            System.out.println("not valid");
        }
    }
    
}
