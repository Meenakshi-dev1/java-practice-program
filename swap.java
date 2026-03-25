public class swap {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println("before swap:a="+a+",b="+b);
        //swapping logic
        int c=a;// store the original value of 'a'
        a=b;// assign the value of 'b' to 'a'
        b=c;// assign the stored original value of 'a' to 'b'
        System.out.println("after swap:a="+a+",b="+b);
    }
    
}
