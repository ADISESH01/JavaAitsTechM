public class ControlStatements {
    public static void main(String[] args)
    {
        //simple if
        int x=5;
        if(x==5)
        {
            System.out.println("x="+x);
        }

        //if else
        x=10;
        if(x==10)
        {
            System.out.println("x is 10");
        }
        else{
            System.out.println("x is "+x);
        }

        //nested if
        x=21;
        if(x>=10)
        {
            if(x<100){
            System.out.println("x is b/w 10 and 100");
        }
        else{
            System.out.println("x is not in range");
        }
    }
    char op='+';
    int a=10,b=20,res=0;
    switch(op)
    {
        case '+':
            res=a+b;
            break;
        case '-':
            res=a-b;
            break;
        default:
            res=100;
    }
    System.out.println("result is: "+res);
    }
}
