import java.util.ArrayList;
import java.util.Arrays;

public class found {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>(Arrays.asList("python","java","c++"));
        String key="python";
        for(int i=0;i<str.size();i++){  
            String str1=str.get(i);         
            if(key==str1){
            System.out.println("found");
            }
            else{
            System.out.println("not found");
            }
        }
    }
}


    

