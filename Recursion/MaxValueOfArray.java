public class MaxValueOfArray {
    public static void main(String args[]){
        int arr[]={13, 1, -3, 22, 5};
        System.out.println(maxvalue(0,arr.length-1,arr[arr.length-1],arr));

    }
    public static int maxvalue(int s, int e, int maxValue, int arr[]){
        if(s==e){
            return maxValue;
        }
        if(arr[e-1]>maxValue){
            maxValue=arr[e-1];
        }
        return maxvalue(s,e-1,maxValue,arr);
    }
}
