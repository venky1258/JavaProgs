import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        int a[]={4,5,9,12,23,56};
        int key=23;
        int l=0,r=a.length-1,mid,f=0;
        while(l<=r)
        {
            mid=(l+r)/2;
            if(a[mid]==key)
            {
                System.out.println("element found at"+mid);
                f=1;
                break;
            }
            else if(a[mid]>key)
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        if(f==0)
        System.out.println("ele not found");
    }
}