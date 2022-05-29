
package achyuth_coding.java;
import java.util.*;
import java.lang.*;
import java.math.*;

public class practice {
    
    public static void main(String args[])
    {
     /*  
        */
        
        
        
         Scanner sc = new Scanner(System.in);
           int a = sc.nextInt();                // for taking the input of number of test cases.
           while(a>0)
           {
               int n = sc.nextInt();            //for entering the number of elements in the given array
               int arr[] = new int[n];
               int e = (int)Math.pow(2, n);     //total number of subsets formed from a given array.
               int subset[][] = new int[e][n];
               int total = 0;                   // for storing the value of addition of XOR values of each subset.
               int row ;                        // for storing the XOR value of each subset makes easy to add .
               int temp = 0;                    // for storing the value of i since it is already used in the for loop.
               for(int i=0 ; i<n ; i++)
               {
                   arr[i] = sc.nextInt();
               }
               
               for(int i=0 ; i<e ; i++)
               {
                   temp = i;
                   row = 0;
                   for(int j=arr.length-1 ; j>=0 ; j--)
                   {
                       int rem = temp%2;
                        temp = temp/2;
                        if(rem!=0)
                        {
                         subset[i][j] = arr[j];
                        }
                        row = row^subset[i][j];
                   }
                   total += row;
               }
               
               System.out.println(total);
               a--;
           }
    }
    
}
