import java.io.*;
public class DeserializationExample {
    public static void main(String args[])throws IOException, ClassNotFoundException
    {
        try{
            FileInputStream src=new FileInputStream("SerialEx.txt");
            ObjectInputStream inp=new ObjectInputStream(src);
            Student s2=(Student)inp.readObject();
            s2.display();
            src.close();
            inp.close();
        }
        finally{
           System.out.println("completed");
        }
    }
}
