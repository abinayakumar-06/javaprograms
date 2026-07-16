import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class max_min {
    public static void main(String[] args) {
        ArrayList<Integer>num=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(Collections.max(num));
        System.out.println(Collections.min(num));
    }
}
