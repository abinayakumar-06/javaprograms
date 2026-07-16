import java.util.ArrayList;

public class even_odd {
    public static void main(String[] args) {
        ArrayList<Integer> num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        int even=0;
        int odd=0;
        for(int i=0;i<num.size();i++){
            int n=num.get(i);
            if(n%2==0){
                even++;
            }
            else{
                odd++;
            } 
        }
            System.out.println("even"+"="+even);
            System.out.print("odd"+"="+odd); 
    }
}