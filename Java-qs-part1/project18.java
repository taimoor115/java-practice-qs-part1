import java.util.Scanner;
class project18{
    public static void main(String[] args){
        Scanner a=new Scanner(System.in);
        System.out.println("Enter length:");
        int length=a.nextInt();
        System.out.println("Enter Width:");
        int width=a.nextInt();
        System.out.println("Enter Height:");
        double height=a.nextDouble();
        System.out.println("Enter door:");
        int door=a.nextInt();
        System.out.println("Enter Windows:");
        int window=a.nextInt();
        double feet=1.00/350.00;//For Finding the area.
        double area=(length*width*height)-(door*21+window*15);
        System.out.println("You need "+feet*area+"gallons of paint");



    }
}