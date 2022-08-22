import java.util.Scanner;
class Project19{
    public static void main(String args []){
        final double Monthly_rate=0.05/12;
        double monthValue1,monthValue2,monthValue3,monthValue4,monthValue5,monthValue6;;
        Scanner a=new Scanner(System.in);
        System.out.println("Enter Your monthly Saving:");
        double monthlySaving=a.nextDouble();
        monthValue1=monthlySaving*(1+Monthly_rate);
        monthValue2=(monthValue1+monthlySaving)*(1+Monthly_rate);
        monthValue3=(monthValue2+monthlySaving)*(1+Monthly_rate);
        monthValue4=(monthValue3+monthlySaving)*(1+Monthly_rate);
        monthValue5=(monthValue4+monthlySaving)*(1+Monthly_rate);
        monthValue6=(monthValue5+monthlySaving)*(1+Monthly_rate);
        System.out.println("Account Value:"+ String.format("%.2f",monthValue6));


    }
}