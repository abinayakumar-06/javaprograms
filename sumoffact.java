public class sumoffact{
    public static void main(String[]args){

        int num1 = 48, num2=75;
        int sum1=0, sum2=0;
        for(int i = 1; i< num1; i++){
            if(num1 % i == 0)
            sum1+= i;
        }
        for(int i = 1; i< num2; i++){
            if(num2 % i == 0)
            sum2+= i;
        }
        System.out.println(sum1 + " "+ sum2);
        if(num2+ 1 == sum1 || num1 + 1== sum2)
        System.out.println("B");
        else
        System.out.println("not B");
    }


}



