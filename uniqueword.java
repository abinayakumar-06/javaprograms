import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.*;
public class uniqueword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]word=sc.nextLine().split(" ");
        LinkedHashSet<String> s=new LinkedHashSet<>(Arrays.asList(word));
        
        System.out.println(s);
    }
}
