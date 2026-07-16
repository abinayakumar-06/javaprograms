import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map {
    public static void main(String[] args) {
        HashMap<Integer,String>roll=new HashMap<>();
        roll.put(1, "hema");
        roll.put(2, "divya");
        roll.put(3, "abi");
        for(String i:roll.values()){
            System.out.println(i);      
        }       
    }
}
