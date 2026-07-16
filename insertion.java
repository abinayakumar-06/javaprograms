public class insertion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        int ans[]=new int [arr.length+1];
        int index=4;
        int insert=5;
        for(int i=0;i<arr.length;i++){
            if(i<index){
                ans[i]=arr[i];
            }
            else if(i==index){
                ans[i]=insert;
            }
            else if(i>index){
                ans[i]=arr[i-1];
            }
        }
        for(int j=0;j<ans.length;j++){
            System.out.print(ans[j]);
        }
            

            
        
    }
}
