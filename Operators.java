public class Operators {
    public static void main(String[] args){
        //1.Arithmetic Operator
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c); 

        //2.Assignment operator
         a=10;
         b=20;
        a+=b;

        //3.unary operator
        //increment
        int num=10;
        num++;
        System.out.println(num);

        //decrement
        int a1=10;
        int b1=a1--;
        System.out.println(b1);

        //4.Relational operator
        a=10;
        b=20;
        boolean c1=a<b;
        System.out.println(c1);
        System.out.println(a>b);
        boolean d=a==b;
        System.out.println(d);
        boolean e=a!=b;
        System.out.println(e);
        int f=70;
        int g=90;
        System.out.println(f<=g);
        System.out.println(f>=g);

        //5.Logical Operator
        a=20;
        b=70;
        c=25;
        boolean f1=(a>b)&&(b<c)&&(a<c);
        boolean e1=!(a<b);
        System.out.println(f1);
        System.out.println(e1);


    }
    
}
