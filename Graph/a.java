public class a {
    public static void abc(int n, String s, String p){
        if(n==0){
            return;
        }
        s=s+"a";
        abc(n-1,s,p+"a");

    }
    public static void main(String args[]){

    }
    
}
