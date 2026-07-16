import java.util.*;
public class vowel {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            char b=str.charAt(i);
            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
            count=count+1;
            }
        }
        if(count>0)
            System.out.println("vowel present");
        else
            System.out.println("vowel absent");
    }
}
