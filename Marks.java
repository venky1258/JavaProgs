import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();  
            sum += arr[i]; 
        }
        System.out.println(sum);
        double avg = sum/(float)arr.length;
        System.out.println("The average marks are: " + avg);
        

    }
    
}
