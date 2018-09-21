import java.util.*;
class test3 {
    public static void main(String[] args) {
                Scanner s1=new Scanner(System.in);
                int n=s1.nextInt();
                int m=s1.nextInt();
                int[] a=new int[m];
                int[][] b=new int[m+1][n+1];
                for(int i=0;i<m;i++) a[i]=s1.nextInt();
                for(int i=0;i<=m;i++) b[i][0]=1;
                for(int i=1;i<=m;i++){
                    for(int j=1;j<=n;j++){
                            if(j>=a[i-1]) b[i][j]=b[i-1][j]+b[i][j-a[i-1]];
                            else b[i][j]=b[i-1][j];
                    }
                }
        System.out.println(b[m][n]);
    }
}
