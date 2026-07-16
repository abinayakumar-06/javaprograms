public class inbuild {
    public static void main(String[] args) {
        String s=" programming";
        System.out.println(s.contains("gram"));
        System.out.println(s.startsWith("pro"));
        System.out.println(s.endsWith("ing"));
        System.out.println(s.indexOf("r"));
        System.out.println(s.lastIndexOf("r"));
        System.out.println(s.substring(0,5));
        System.out.println(s.concat("java"));
        System.out.println(s.replace("progamming","easy"));
        System.out.println(s.replace("a", "@"));
        System.out.println(s.trim());
        System.out.println(s.strip());
    }
}
