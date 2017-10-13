package trick2;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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

        List l = new ArrayList();
        List l2 = Collections.synchronizedList(l);
    }
}