import java.util.Scanner;

public class AddDemo {
public static void main(String[] args) {
    int a,b,c;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a");
    a=scan.nextInt();
    System.out.println("enter b");
    b=scan.nextInt();
    c=a*b;
    System.out.println(c);
    scan.close();
}
    
}
