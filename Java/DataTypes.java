import java.util.*;

class DataTypes
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter data:");
        int a=s.nextInt();
        byte b=s.nextByte();
        long c=s.nextLong();
        float d=s.nextFloat();
        double e=s.nextDouble();
        char f=s.next().charAt(0);
        String g=s.next();
        boolean h=s.nextBoolean();
        s.close();
        
        System.out.println("int data : "+a);
        System.out.println("byte data : "+b);
        System.out.println("Long data : "+c+"\nFloat data : "+d+"\nDouble data : "+e+"\nChar data : "+f+"\nString data : "+g+"\nBoolean data : "+h);
    }
    
}
