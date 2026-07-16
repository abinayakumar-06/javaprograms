import java.util.HashMap;
import java.util.Scanner;

public class frequencystr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<String,Integer>map=new HashMap<>();
        for(String word:str.split(" ")){
            map.put(word,map.getOrDefault(word, 0)+1);
        }
        System.out.print(map);
    }
}
