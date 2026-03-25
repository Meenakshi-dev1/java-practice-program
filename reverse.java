public class reverse {
    public static void main(String[] args)
    {
        int num=12345;// hardcoded input number
        int reversednum=0;
        int remainder;
        while(num!=0)
        {
            // get the  last digit
            remainder=num%10;
            //add the digit to the reversed number
            reversednum=reversednum * 10 + remainder;
            // remove the last digit from the original number
            num/=10;
        }
        System.out.println("reversed number:" + reversednum);
        String str = "Hello";
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }

    }
    
}
