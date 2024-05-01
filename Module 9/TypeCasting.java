public class TypeCasting {
    public static void main(String args[]){
        byte a=23;
        int b=a;
//        char c=a;//error
        long d=a;
        double e=a;

        byte q=(byte)e;
        char w='a';
        int we=w;
        short wer=(short)w;
        int qw=3223465;
        char c=(char)qw;
        System.out.println(c);
    }
}
