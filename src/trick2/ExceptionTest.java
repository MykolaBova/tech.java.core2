package trick2;

/**
 * Created by mbovalocal on 09.09.17.
 */
public class ExceptionTest{
    public static void main(String rags[]){
        try{
            throw new  RuntimeException();
        }catch(RuntimeException re){
            re.printStackTrace();
        }
    }
}
