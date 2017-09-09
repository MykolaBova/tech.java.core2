package trick2;

/**
 * Created by mbovalocal on 09.09.17.
 */
class Ex1{
    public void a1()
    {
        System.out.println("a1 from Ex1");
    }
}

class Ex2 extends Ex1{
    public void a1()
    {
        System.out.println("a1 from Ex2");
    }
}

public class Overriding {
    public static void main(String[] args){
        Ex1 e1=new Ex2();
        e1.a1();
    }
}
