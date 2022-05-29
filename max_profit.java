
package achyuth_coding.java;
import java.util.*;
import java.math.*;

public class max_profit {
    
      public static void main(String args[])
      {
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                       // for giving the input for number of test cases.
        while(n>0)
        {
        int a = sc.nextInt();                       // number of elements present inside the array.
        int arr[] = new int[a];
        for(int i=0 ; i<a ; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int profit = arr[1]-arr[0];             // for storing the maximum profit we use the profit variable.
        for(int i=0 ; i<a ; i++)
        {
            for(int j=i+1; j<a ; j++)
            {
                if(profit < arr[j]-arr[i])
                {
                    profit = arr[j] - arr[i];
                }
            }
        }
        if(profit<0)
        {
            System.out.println("0");
        }
        else 
        {
        System.out.println(profit);
        }
        a--;
        } 
           
          
      }
}
        
