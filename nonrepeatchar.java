public class nonrepeatchar {
    public static void main(String[] args) {
        String s="abinaya";
        for(int i=0;i<=s.length();i++){
            char ch=s.charAt(i);
            Boolean repeat=false;
            for(int j=0;j<s.length();j++){
                if(i!=j && ch==s.charAt(j)){
                    repeat=true;
                    break;
                }
            }
            if(!repeat){
                System.out.println("non repeating char "+ch);
                break;
            }
        }
    }
}
