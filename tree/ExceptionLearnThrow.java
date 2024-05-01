/**
 * ExceptionLearnThrow
 */
class MyException extends Exception{
    MyException(String mess){
        super(mess);
    }

}
public class ExceptionLearnThrow {

    public static void main(String[] args) {
        int a=6;
        int b=-2;
        int res;
        try{
            if(b<0){
                MyException e=new MyException("sjksj");
                throw e;
                 
            }
            res=a/b;

        }
        catch(Exception e){
            System.out.println("enetr valid number "+ e);

        }
    }
}