public class prime {
    public static void main(String[] args) {
        int num =29; //the number to check(change this value as needed)
        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        if (num<=1)
        {
            isPrime=false;
        }
        else{
            //check for factors from 2 upto the square root of the number for efficiency
            for(int i=2;i*i<=num;i++)
            {
                if(num%i==0)
                {
                    isPrime=false;
                    break;// exit the loop as soon as a  factor is found
                }
            }
        }
        if(isPrime){
            System.out.println(num+" is a prime number.");
        }
        else{
            System.out.println(num+" is not a prime");
        }
    }
    
}
