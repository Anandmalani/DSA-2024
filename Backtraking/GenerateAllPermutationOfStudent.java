public class GenerateAllPermutationOfStudent {
    public static void main(String args[]){
        allPermu("abc","");


    }
    public static void allPermu(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            String upstr= str.substring(0,i)+str.substring(i+1);

            allPermu(upstr,ans+str.charAt(i));

        }

    }
}
