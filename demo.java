import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
public static void main(String[] args) {
    int arr[]={7,9,2,8,5,1};
    int i,j;
    for(i=0;i<arr.length-1;i++)
    {
        for(j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int t;
                t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
    }
    for(i=0;i<arr.length;i++)
    System.out.println(arr[i]);    
}}