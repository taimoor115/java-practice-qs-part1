import java.util.Locale;
import java.util.Scanner;
class project5{
    public static void main(String[]args){
        int stringSize;
        char letter;
        Scanner t=new Scanner(System.in);
        System.out.println("What is your Favourite City:");
        String name=t.nextLine();
        String upercase=name.toUpperCase();
        System.out.println("The name of the city in all uppercase letters:"+upercase);
        String lowerCase=name.toLowerCase();
        System.out.println("The name of the city in all lowercase letters:"+lowerCase);
        letter=name.charAt(0);
        System.out.println("The first character in the name of the city:"+letter);
        stringSize=name.length();
        System.out.println("The number of characters in the city name:"+stringSize);




    }

}