import java.util.Arrays;
import java.util.Scanner;

public class demo {
public static void main(String[] args) {
   int ar[]={5,1,8,2,9};
   int i,j;
   int t;
   for(i=0;i<ar.length-1;i++)
   {
    for(j=0;j<ar.length-i-1;j++)
    {
        if(ar[j]>ar[j+1])
        {
            t=ar[j];
            ar[j]=ar[j+1];
            ar[j+1]=t;
        }
    }
   }
   //System.out.println(Arrays.toString(ar));
   for(i=0;i<ar.length;i++)
    System.out.println(ar[i]);
}    
}