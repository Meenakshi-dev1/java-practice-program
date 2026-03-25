public class Casting{
    public static void main(String[] args){
        //1.widening(small to big conversion)
        byte b=10;
        int c=b;
        System.out.println(c);

        //2.narrowing(big to small conversion)
        int a=129;
        byte a1=(byte)a;
        System.out.println(a1);
        
    }
}