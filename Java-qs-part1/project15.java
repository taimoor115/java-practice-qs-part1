import javax.swing.*;
import java.math.*;
class Circle{
    public static void main(String args[]){
        String r= JOptionPane.showInputDialog("Enter the radius");
        double Radius=Double.parseDouble(r);
        double area=Radius*Radius*Math.PI;
        double perimeter=2*Radius*Math.PI;
        System.out.println("Area="+Math.round(area));
        System.out.println("Perimeter="+Math.round(perimeter));


    }
}