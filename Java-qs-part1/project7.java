import javax.swing.JOptionPane;
import java.util.Scanner;
class Project7{
    public static void main(String[]args){
        double sharepfstocks=600,pershare=21.77;
        double aos,aoc,aosc;
        aos=sharepfstocks*pershare;
        System.out.println("Amount paid for stock alone:"+aos);
        aoc=aos*0.02;
        System.out.println("Amount of commission:"+aoc);
        aosc=aos+aoc;
        System.out.println("The total amount paid (Stock+Commission)"+aosc);

    }
}