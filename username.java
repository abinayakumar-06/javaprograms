import java.util.*;
public class username {
    public static void main(String[] args) {
        Set<String>name=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            name.add(sc.next());
        }
        Scanner obj=new Scanner(System.in);
        Set<String>input=new HashSet<>();
        String username=sc.nextLine();
        if(name.contains(username)){
            System.out.println("username already exist");
        }
        else{
            System.out.println("username is available");
        }
        

        
    }
}
