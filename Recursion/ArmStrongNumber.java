public class ArmStrongNumber {
    public static void main(String args[]){
        System.out.println(armStrongNumber(153,0));

    }
    public static boolean armStrongNumber(double n, double ans){
        double a=n;
        while(a%10!=0){

            ans=ans+Math.pow((int)(a%10),(int)(3));
            a=a/10;


        }
        ans=ans+Math.pow((int)(a/10),(int)(3));

        if(n==ans){
            return true;
        }
        else{
            return false;
        }
    }
}
