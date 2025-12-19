package SEE;
import CIE.Personal;
import java.util.Scanner;
public class External extends Personal{
    int[] seeMarks=new int[5];
    public External(String usn,String name,int sem,int[] marks){
        super(usn,name,sem);
        seeMarks=marks;
    }
}