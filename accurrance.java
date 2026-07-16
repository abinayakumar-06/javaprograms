

public class accurrance {
   public static void main(String[]args){
      String s=" how was your life is going";
      int count=0;
      for(int i=0;i<s.length();i++){
         if(s.charAt(i)=='i'){
            count++;
         }
      }
      System.out.println(count);
   }
}
