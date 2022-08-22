import javax.swing.JOptionPane;
class project20{
    public static void main(String args[]){
       String a=JOptionPane.showInputDialog("How many cookies You want??");
       int b=Integer.parseInt(a);
       double cups=(0.0315*b);
       double butter=0.0203333333333*b;
       double flour=0.057292*b;
       System.out.println("Cups required:"+cups);
       System.out.println("Butter Required:"+butter);
       System.out.println("Flour Required"+flour);

    }
}
