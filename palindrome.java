public class palindrome {
    public static void main(String[] args) {
        String s="amma";
        String a = "";
        for(int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        if(a.equals(s))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
