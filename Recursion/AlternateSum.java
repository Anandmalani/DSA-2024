public class AlternateSum {
    public static void main(String args[]){
        System.out.println(alternateSum(10));

    }
    public static int alternateSum(int n){
        if(n==1){
            return 1;
        }
        else if(n%2==0){
            return alternateSum(n-1)-n;

        }
        else{
            return alternateSum(n-1)+n;
        }

    }
}
