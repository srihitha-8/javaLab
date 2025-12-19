import CIE.*;
import SEE.*;
import java.util.Scanner;
import java.util.Arrays;
public class Demo{
    public static void main(String[] args){
        System.out.print("Enter n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter details of student "+i+": ");
            System.out.print("Enter Name: ");
            String name=sc.next();
            System.out.print("Enter USN: ");
            String usn=sc.next();
            System.out.print("Enter sem: ");
            int sem=sc.nextInt();
            int[] Ciemarks=new int[5];
            int[] Seemarks=new int[5];
            for(int j=1;j<=5;j++){
                System.out.print("Enter internal marks for suject "+j+": ");
                int marks=sc.nextInt();
                Ciemarks[j-1]=marks;
                System.out.print("Enter see marks for subject "+j+": ");
                int num=sc.nextInt();
                Seemarks[j-1]=num;
            }
            Internals in=new Internals(Ciemarks);
            External ex=new External(usn,name,sem,Seemarks);
            int[] Final=new int[5];
            for(int k=0;k<5;k++){
                Final[k]=Ciemarks[k]+Seemarks[k];
            }
            System.out.print("Final marks of "+name+": "+Arrays.toString(Final));
        }
    }
}