public class Domain {
    public static void main(String[]args){                                        
        String s="example @gmail.com";
        int s1=s.indexOf('@');
        String domain=s.substring(s1+1);
        System.out.println(domain);
    }
    
}
