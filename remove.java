import java.util.ArrayList;
import java.util.Arrays;

public class remove {
    public static void main(String[] args) {
        ArrayList<String>str=new ArrayList<>(Arrays.asList("python","java","c++"));
        str.remove(0);
        for(String i:str){
            System.out.print(i);
        }
    }
}
