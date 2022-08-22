class project9{
    public static void main(String[]args){
        double sharepfstocks=1000,pershare=32.87,Sharesold=1000,soldback=33.92;
        double buy,commission,total,sold,commissionsold,totalsold,profit;
        buy=sharepfstocks*pershare;
        commission=buy*0.02;
        total=buy+commission;
        sold=sharepfstocks*soldback;
        commissionsold=sold*0.02;
        totalsold=sold+commissionsold;
        profit=totalsold-total;
        System.out.println("The amount of money Joe paid for the stock:"+buy);
        System.out.println("The amount of commission Joe paid his broker when he bought the stock.:"+commission);
        System.out.println("The total amount paid (Stock+Commission)"+total);
        System.out.println("The amount of money Joe sold for the stock:"+sold);
        System.out.println("The amount of commission Joe paid his broker when he sold the stock.:"+commissionsold);
        System.out.println("The total amount paid (Stock+Commission)"+totalsold);
        System.out.println("Profit="+profit);


    }
}