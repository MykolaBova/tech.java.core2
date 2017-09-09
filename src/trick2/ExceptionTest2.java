package trick2;

import java.io.FileNotFoundException;

/**
 * Created by mbovalocal on 09.09.17.
 */
class ExceptionTest2 {
    public static void main(String... args){
        try{
            ExceptionTest2 t=new ExceptionTest2();
            throw new FileNotFoundException();
        }catch(FileNotFoundException e){
//handle exception
        }
    }
}