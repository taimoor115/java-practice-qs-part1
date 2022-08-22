import javax.swing.JOptionPane;
class Project8{
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog("What is your Name?");
        String b=JOptionPane.showInputDialog("What is your age?");
        String c=JOptionPane.showInputDialog("Which City you belong?");
        String d=JOptionPane.showInputDialog("What is your College name?");
        String e=JOptionPane.showInputDialog("Which Profession you belong?");
        String f=JOptionPane.showInputDialog("Which animal you like?");
        String g=JOptionPane.showInputDialog("WHat is your pet name?");
        JOptionPane.showMessageDialog(null,"There was a person named "+a+" who lived in "+c+".At the age of "+b+a+" went to college "+d+"."+a+" graduated and went to work as a"+e+" Then,"+a+" adopted a Animal "+g+" and petnamed "+f+" both lived happily");

    }
}