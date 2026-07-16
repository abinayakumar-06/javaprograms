public class swap {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int pos1=1,pos2=3;
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}
