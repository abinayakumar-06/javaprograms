import java.util.*;
public class password{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean digit=false;
        boolean upper=false;
        boolean spe=false;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.length()>=8){
            if(Character.isDigit(ch)){
                digit=true;
            }
            if(Character.isUpperCase(ch)){
                upper=true;
            }
            if(!(Character.isLetterOrDigit(ch))){
                spe=true;
            }
            }
            else{
                System.out.println("invalid");
            }
        }
        if(digit && upper && spe){
            System.out.println("strong password");
        }
        else{
            System.out.println("not a strong password");
        }
    }
}

