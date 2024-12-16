import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo {
public static void main(String[] args) {
    Integer a[]={2,5,8};
    Integer b[]={5,8,2};
    Arrays.sort(a);
    Arrays.sort(b);
    System.out.println(Arrays.equals(a,b));
 

    List<Integer> l1=Arrays.asList(a);
    System.out.println(l1);

}}