public class multiply {
    public static void main(String[] args) {
        int a=10,b=5,res=0;
        for(int i=0;i<Math.abs(b);i++)
            res+=a;
            if(b<0)
                res=-res;
                System.out.println(res);
    }
}
