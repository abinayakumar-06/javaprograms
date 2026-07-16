public class mulof2arr {
    
    public static void main(String[] args) {

        int a[][] = {{1, 2}, {3, 4}};
        int b[][] = {{5, 6}, {7, 8}};
        int c[][]= new int[2][2];
        for (int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                for(int k=0;k<c.length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                    System.out.print(c[i][j]+" ");
                }
            }
            
        }
    }
}


//array is given {1,2}{3,4} b={5,6}{7,8}
//19 22 43 50