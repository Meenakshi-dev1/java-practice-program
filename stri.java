import java.util.Scanner;

public class stri {
    public static void main(String[] args) {
        String str="Meenakshi";
        System.out.println(str);
        String S=new String("Lakshmi");
        System.out.println(S);
        String stri="meena";
        // 1.to.UpperCase() and 2.to.LowerCase() 
        String str1=stri.toUpperCase();
        System.out.println(stri.toUpperCase());// change lowercase into uppercase //
        System.out.println(str1);
        // 3.length() 
        System.out.println(str.length());// count character length //
        System.out.println(stri.length());
        System.out.println(S.length());
        System.out.println(str1.length());
        System.out.println("meena".length());
        // 4.charAt()
        System.out.println(str.charAt(1));// find index value //
        System.out.println(S.charAt(1));
        // 5.indexOf()
        System.out.println(str.indexOf('e'));
                System.out.println(str.indexOf('n'));// find char value //
         // 6.startsWith()     
                String sample =new String("welcome world");
                System.out.println(sample.startsWith("wel"));// if the starting value is correct it return true //
                System.out.println(sample.startsWith("Wel"));// if the starting value is wrong it return false //
        // 7.endsWith()
                System.out.println(sample.endsWith("rl"));// if the ending value is wrong it returns false
                System.out.println(sample.endsWith("ld"));// if the ending value is correct it returns true
         // 8.substring()      
                String mm=sample.substring(0,7);// it return char based on index value
                System.out.println(mm);
        // 9.equals()
        String v="meena";
        String vv="Meena";
        System.out.println(v.equals(vv));// equals() function used to check the character between two strings //
        System.out.println(v.equals(v));
        String s="Nila";
        String sv="Nila";
        System.out.println(s.equals(sv));
        Scanner Scan =new Scanner (System.in);
        System.out.println("Enter the Numbers");
        int a=Scan.nextInt();
        int b=Scan.nextInt();
        int c=a+b;
        System.out.println("Your output is :"+ c);
        System.out.println("Enter two float numbers:");
        float f = Scan.nextFloat();   
        float d = Scan.nextFloat();   
        float sum = f + d;
        System.out.println("Float sum is : " + sum);
        String ff=Scan.next();
        System.out.println("Your string is: " + ff);
        String ee=Scan.nextLine();
        System.out.println("entered string is:" +ee);
        Scan.close();
    }
 }
    

