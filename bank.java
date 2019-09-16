import java.util.Scanner;
import java.lang.Math;

class bank
{
    //public double ci;
    //public double p;
    //public double ir=0.03;
    //public double t;
    public static double bal=32469.42;
    public static int minbal=1000;
    
    public static void SA()
    {
        System.out.println("Welcome to Saving Account");
        System.out.println("1. Add Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. View Balance");
        System.out.println("4. View Interest generated.");
        Scanner s1 = new Scanner(System.in);
        int b = s1.e=nextInt();
        switch(b)
        {
            case 1:
                System.out.println("Enter the amount:");
                double x = s1.nextInt();
                System.out.println("Money Added:"+x);
                x+=bal;
                System.out.println("Current Balance:"+x);
                break;
            case 2:
                System.out.println("Enter the amount:");
                double y = s1.nextInt();
                System.out.println("Money deducted:"+y);
                y-=bal;
                System.out.println("Current Balance:"+y);
                break;
            case 3:
                System.out.println("Current Balance:"+bal);
                break;
            case 4:
                System.out.println("Enter the time period:");
                int t = s1.nextDouble();
                double p=bal;
                double ci=p*Math.pow(1+0.03, t);
                System.out.println("The Compound Interest generated:"+ci);
                break;
            case 5:
                break;
        }
        //System.out.println("");
    }

    public static void CA()
    {
        System.out.println("Welcome to Current Account");
        System.out.println("1. Add Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. View Balance");
        System.out.println("4. Apply for a cheque book.");
        Scanner s2 = new Scanner(Systen.in);
        int c = s2.nextInt();
        switch(c)
        {
            case 1:
                System.out.println("Enter the amount:");
                double x = s1.nextInt();
                System.out.println("Money Added:"+x);
                x+=bal;
                System.out.println("Current Balance:"+x);
                break;
            case 2:
                System.out.println("Enter the amount:");
                double y = s1.nextInt();
                System.out.println("Money deducted:"+y);
                y-=bal;
                System.out.println("Current Balance:"+y);
                break;
            case 3:
                System.out.println("Current Balance:"+bal);
                break;
            case 4:
                System.out.println("Your request has been accepted.\nThe cheque book will arrive soon.");
                break;
            case 5:
                break;
        }
        if(bal<minbal)
        {
            double ser_ch=bal*0.1;
            System.out.println("");
            System.out.println("Balance is below Minimum Balance. \n"+ ser_ch +" to be paid (service charges)");
        }
    }
    public static void main(String args[])
    {
        int a=0;
        while(a!=3)
        {
            System.out.println("Welcome to XYZ bank.");
            System.out.println("1. Saving account.");
            System.out.println("2. Current account.");
            System.out.println("3. Exit");
            //Scanner s1 = new Scanner(System.in);
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
            switch(a)
            {
                case 1:
                    SA();
                    break;
                case 2:
                    CA();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter a valid option.");
            }
            //i++;
        }
    }
}




