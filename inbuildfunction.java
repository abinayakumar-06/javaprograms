import java.util.HashMap;
import java.util.Map;

public class inbuildfunction {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>(Map.of(1,"abinaya",2,"dhanushiya",3,"deva"));
        map.put(4, "lakshitha");
        System.out.println(map);
        System.out.println(map.get(3));
        System.out.println(map.remove(4));
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("deva"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.putIfAbsent(1,"abinaya"));
        System.out.println(map.getOrDefault(2, "dhanushiya"));
        System.out.println(map.replace(1,"abinaya"));
        //System.out.println(map.putAll());
    }
}
