import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        int[] newArray= new int[10];
        int[] arr = new int[n];
        for( i=0; i < n; i++){
            arr[i] = in.nextInt();
            //System.out.println(arr[n-i]);
        }
        for(i=0;i<n;i++) {
            int nxt= n-i-1;
        
            System.out.print(arr[nxt]+" ");
        }
        //System.out.println(newArray[n-i]+" ");
            
        
        in.close();
}
    }

