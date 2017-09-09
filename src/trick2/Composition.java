package trick2;

/**
 * Created by mbovalocal on 09.09.17.
 */
class Parent{
    public Parent()
    {
        System.out.println("Parent Constructor");
    }
    public int size=10;
}
public class Composition {
    static public void main(String... args){
        try{
            Parent p=new Parent();
            System.out.println("P size is :"+p.size);
        }catch(Exception e){
            System.out.println("Exception is "+e);
        }
    }
}