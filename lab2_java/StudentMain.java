import java.util.Scanner;
import java.util.Arrays;
class Student{
    String usn;
    String name;
    int[] credits;
    int[] marks;
    
    public void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name=sc.next();
        System.out.print("USN: ");
        this.usn=sc.next();
        System.out.print("Enter number of subjects: ");
        int n=sc.nextInt();
        credits=new int[n];
        marks=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter credits for subject"+(i+1)+": ");
            this.credits[i]=sc.nextInt();
            System.out.print("Enter marks in grade points for subject"+(i+1)+": ");
            this.marks[i]=sc.nextInt();
        }
    }
    
    public void display(){
        System.out.println("USN: "+this.usn);
        System.out.println("Name: "+this.name);
        System.out.println("credits: "+Arrays.toString(credits));
        System.out.println("marks: "+Arrays.toString(marks));
    }
    
    public double SGPA(){
        double sgpa=0;
        int creditSum=0;
        for(int i=0;i<credits.length;i++){
            sgpa+=credits[i]*marks[i];
            creditSum+=credits[i];
        }
        return sgpa/creditSum;
    }
}
class StudentMain {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.accept();
        stu.display();
        double sgpa=stu.SGPA();
        System.out.printf("SGPA: %.2f",sgpa);
    }
}
