import java.util.ArrayList;

public class index {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("python");
        str.add("java");
        str.add("c++");
        str.remove(1);
        System.out.println(str);
    }
}
