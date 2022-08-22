import javax.swing.JOptionPane;
class project6{
    public static void main(String[]args){
        double m,f,p,percentage;
        double c=20;
        String males=JOptionPane.showInputDialog("Number of Males in a Class:");
        String Females=JOptionPane.showInputDialog("Number of Females in a Class:");
        m=Double.parseDouble(males);
        f=Double.parseDouble(Females);
        p=(m/c)*100;
        percentage=(f/c)*100;
        System.out.println(p);
        System.out.println(percentage);
        JOptionPane.showMessageDialog(null,"Percentage of males is "+p);
        JOptionPane.showMessageDialog(null,"Percentage of Females is "+percentage);






           }
}