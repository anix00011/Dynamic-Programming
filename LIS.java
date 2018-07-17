package any;

   import java.util.*;

    public class LIS{
            static int lis(int arr[],int n)
            {
                Integer lis[] = new Integer[n];//this type of conversion is important to use Arrays.asList()
                int i,j,max = 0;
                for ( i = 0; i < n; i++ )
                    lis[i] = 1;
                for ( i = 1; i < n; i++ )
                    for ( j = 0; j < i; j++ )
                        if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                            lis[i] = lis[j] + 1;
                for (int x:lis) System.out.print(x);
                System.out.println();
                max=Collections.max(Arrays.asList(lis));
                return max;
            }

            public static void main(String args[])
            {
                int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
                int n = arr.length;
                System.out.println("Length of lis is " + lis( arr, n ));
            }
        }
