import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
public static void main(String[] args) {
   int m[]=new int[6];
   int i;
   int sum=0;
   Scanner scan=new Scanner(System.in);
   System.out.println("enter marks");
   for(i=0;i<m.length;i++){
    m[i]=scan.nextInt();
    sum+=m[i];
   }
   System.out.println("given marks");
   for(i=0;i<m.length;i++)
    System.out.println(m[i]);
    System.out.println("total is "+sum);
    System.out.println("avg marks "+sum/6.0);
    int max=m[0];
    for(i=1;i<m.length;i++)
     {
        if(max<m[i])
        max=m[i];
     }
     System.out.println("Max marks "+max);
    Integer a[]={2,5,8};
    Integer b[]={5,8,2};
    Arrays.sort(a);
    Arrays.sort(b);
    System.out.println(Arrays.equals(a,b));
    List<Integer> l1=Arrays.asList(a);
    System.out.println(l1);

}}