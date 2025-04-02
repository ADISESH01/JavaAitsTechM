import java.util.*;
class Days{
    public static void main(String a[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a num:");
        int num=s.nextInt();

        switch(num)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}