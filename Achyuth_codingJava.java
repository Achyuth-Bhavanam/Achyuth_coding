
package achyuth_coding.java;
import java.util.*;
import java.math.*;

public class Achyuth_codingJava {

    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();               // for knowing the size of the array that we want to use .
            int arr[] = new int[n];
            int index = 1;                      // for getting the index of the leader element.
            for(int i=0 ; i<n ;i++)
            {
                arr[i] = sc.nextInt();
                if(i>0 && arr[i]>arr[i-1])
                {
                    index = i;
                }
            }
            if(index == 1 && arr[0]>arr[index])
            {
                index = 0;
            }
            for(int i=index;i<n ;i++)
            {
                System.out.print(arr[i]+" ");
            }
          
    }
    
}
