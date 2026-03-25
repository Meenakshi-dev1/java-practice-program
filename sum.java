public class sum {
    public static void main(String[] args)
    {
        int number=12345;// the number to calculate the sum of digits for
        int sum=0;
        int tempnumber=number;// use a temporary variable to preserve the original number
        while(tempnumber>0)
        {
            int digit =tempnumber%10;// extract the  last digit 
            sum=sum+digit;// add the digit to the sum
            tempnumber=tempnumber/10;// remove the last digit(e.g.,1234)
        }
        System.out.println("the number is:" + number);
        System.out.println("the sum of the digits is : "+ sum);
        
        int num=123;
        int digit1=0;
        for(;num>0;num=num/10)
        {
            sum=num%10;
            digit1=digit1+sum;
            
            System.out.println(digit1);

        }
    }
}
