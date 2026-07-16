import java.util.*;
public class arraylist{
    public static void main(String[]args){
        ArrayList<Integer> num=new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        ArrayList<Integer> num1=new ArrayList<>();
        num1.add(1);
        num1.add(4);
        num1.add(5);

        
            System.out.print(num.remove(num1));
            System.out.print(num.retainAll(num1));
            System.out.print(num.addAll(num1));
        
        
        
        }
    
    }
