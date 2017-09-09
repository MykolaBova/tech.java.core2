package trick2;

/**
 * Created by mbovalocal on 09.09.17.
 */
class Example
{
    public void fun(int a)
    {
        System.out.println("value of a :"+a++);
        return;
    }
    public static void main(String[] args)
    {
        Example e1=new Example();
        e1.fun(3);
    }
}