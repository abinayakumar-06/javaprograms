public class average {
    public static void main(String[] args) {
        int[] age={10,20,30,40};
        int sum=0;
        for(int i=0;i<=age.length-1;i++){
            sum+=age[i];
        }
        double avg=(double)sum/age.length;
        System.out.println(avg);

    }
}
