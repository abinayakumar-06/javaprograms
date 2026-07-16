import java.util.HashMap;
import java.util.Map;

public class phone {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<>(Map.of("kumar","8220784260","sangeetha","8682889646","abi","7305892129"));
        System.out.println(map.entrySet());
    }
}
