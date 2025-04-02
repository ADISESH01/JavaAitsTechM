import java.io.*;
public class ConsoleSample {
    public static void main(String args[])
    {
        Console console=System.console();
        if(console==null)
        {
            System.out.println("There is no console");
            return;
        }

        String name=console.readLine("Username : ");
        char[] password=console.readPassword("Password : ");

        console.format("Hello %s!",name);
        console.format("your password has %d characters", password.length);
    }
}
