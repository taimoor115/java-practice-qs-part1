import javax.swing.JOptionPane;
import java.util.Scanner;
class project2{
 public static void main (String[]args){
     char firstInitial,middleIntial,lastInitial;
     Scanner t=new Scanner(System.in);
     System.out.println("Enter First name:");
     String first=t.nextLine();
     System.out.println("Enter middle name:");
     String middle=t.nextLine();
     System.out.println("Enter last name:");
     String last=t.nextLine();
    firstInitial = first.charAt(0);
     System.out.println("First Inital="+firstInitial);
     middleIntial=middle.charAt(0);
     System.out.println("Middle Initial="+middleIntial);
     lastInitial=last.charAt(0);
     System.out.println("Last Initial"+lastInitial);




 }

}