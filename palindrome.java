public class palindrome {
    public static void main(String[] args) {
        int originalnumber=121; // manually initialize the number
        int num=originalnumber;
        int reversednumber=0;
        int remainder;

        //reverse the number using a while loop
        while(num!=0)
        {
            remainder =num%10;
            reversednumber=reversednumber * 10 + remainder;
            num/=10;
        }
        //check if the reversed number is equal to the original
        if(originalnumber==reversednumber)
        {
            System.out.println(originalnumber + " is a palindrome number.");
        }
        else{
            System.out.println(originalnumber+" is not a palindrome number. ");
        }
        }
    }
    
