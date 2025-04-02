import java.io.*;
public class CharStream {
    public static void main(String[] args)throws IOException
    {
        FileReader r=null;
        FileWriter w=null;
        try{
            r=new FileReader("D:/21701A05A8/Java/SrcFile");
            w=new FileWriter("D:/21701A05A8/Java/DestFile");
            int temp;
            while((temp=r.read())!=-1)
            {
                w.write(temp);
            }
        }
        catch(Exception e)
        {
            System.out.println("in catch");
        }
        finally{
            if(r!=null )
            {
                r.close();
                w.close();
            }
        }
    }
}
