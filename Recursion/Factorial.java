public class Factorial {
    public static void main(String args[]){
        Factorial f1=new Factorial();
        System.out.println(f1.fac(5));
    }
    public int fac(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return fac(n-1)*n;
        }
    }
}
