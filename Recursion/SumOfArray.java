public class SumOfArray {
    public static void main(String args[]){
        int arr[]={92, 23, 15, -20, 10};
        System.out.println(sumOfArray(arr,0,0,arr.length-1));


    }
    public static int sumOfArray(int arr[], int sum, int s, int e){
        if(s<e){


            sum=sum+arr[e];
            return sumOfArray(arr,sum,s,e-1);
        }
        else{
            return sum+arr[e];
        }




    }
}
