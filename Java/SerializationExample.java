import java.io.*;
class Student implements Serializable
{
    String name;
    int rno;
    Student(String name, int rno)
    {
        this.name=name;
        this.rno=rno;
    }
    void display()
    {
        System.out.println("Name: "+name+" Rno: "+rno);
    }
}
public class SerializationExample {
    public static void main(String[] args)throws IOException
    {
        Student s1=new Student("Raghu",120);
        FileOutputStream fo=null;
        try{
            fo=new FileOutputStream("D:/21701A05A8/Java/SerialEx.txt");
            ObjectOutputStream o=new ObjectOutputStream(fo);
            o.writeObject(s1);
        }
        finally{
            fo.close();
        }
    }


}
