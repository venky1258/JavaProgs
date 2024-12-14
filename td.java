import java.util.Scanner;

class td
{
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j,t=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter A  array values");
        for(i=0;i<a.length;i++){       
            for(j=0;j<a[i].length;j++){            
                a[i][j]=scan.nextInt();
            }
        } 
        System.out.println("enter B array values");
        for(i=0;i<a.length;i++){       
            for(j=0;j<a[i].length;j++){            
                b[i][j]=scan.nextInt();
            }
        }      


        
        for(i=0;i<a.length;i++)
          for(j=0;j<a[i].length;j++)
            c[i][j]=a[i][j]+b[i][j];
        

        
        System.out.println("c array values");
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
               System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
       
    }
}
