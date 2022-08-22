import java.util.Scanner;
class project1{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        System.out.print("My name is");
        String name=t.nextLine();
        System.out.print("My age is=");
        int age=t.nextInt();
        System.out.print("Annual Pay= ");
        double pay=t.nextDouble();
        System.out.print("My name is "+name);
        System.out.print(" My age is "+age);
        System.out.print(",and\n my annual pay is ="+pay+" per year ");

    }
}