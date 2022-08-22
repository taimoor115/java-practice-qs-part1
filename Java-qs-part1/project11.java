import java.math.*;
import java.lang.Math;
import java.util.Scanner;
class project11{
    public static void main(String[]args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter Present Value:");
        int pV=a.nextInt();
        System.out.println("Enter number of months:");
        int n=a.nextInt();
        float r=0.1f;
        double fV=pV*Math.pow((1+r),n);
        System.out.println(fV);

    }
}