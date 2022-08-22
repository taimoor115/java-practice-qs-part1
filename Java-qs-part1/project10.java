import java.util.Scanner;
class Prject10{
    public static void main(String[] args){
        int sizeString1,sizeString2;
        Scanner SC=new Scanner(System.in);//SC:String Compare
        System.out.println("Enter your first string:");
        String FS=SC.nextLine();//First String
        System.out.println("Enter Your Second String:");
        String SS=SC.nextLine();//Second String
        sizeString1=FS.length();
        sizeString2=SS.length();
        System.out.println("Enter the First String="+FS);
        System.out.println("Enter the Second String="+SS);
        System.out.println("Size of First String is="+sizeString1);
        System.out.println("Size of Second String is="+sizeString2);

        System.out.println(FS.equalsIgnoreCase(SS));






    }
}