public class SumOfDigits {
    public static void main(String args[]){
        System.out.println(sumOfDigits(1));

    }
    public static int sumOfDigits(int n){
        if(n/10==0){
            return n%10;
        }
        return n%10+sumOfDigits(n/10);

    }
}
