class Mythread extends Thread{
    public void run(){
        String a=Thread.currentThread().getName();
        if(a.equals("cal")){
            try {
                cal();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            cal1();
        }



    }
    public void cal() throws InterruptedException {
        System.out.println("cal");
        Thread.sleep(5000);

    }
    public void cal1(){
        System.out.println("cal1");

    }

}
public class MultiThreadUsingRunMethod {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("hello");
        Mythread t1=new Mythread();
        Mythread t2=new Mythread();
        t1.setName("cal");
        t2.setName("cal1");
        t1.start();
        t1.join();
        t2.start();

        System.out.println("main work completed hello");
    }
}
