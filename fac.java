public class fac {
    public static void main(String[] args)
    {
        int number=5; // The number to find the factorial of
        long factorial=1; // use 'long' to handle larger results

        // check if the number is negative
        if (number < 0)
        {
            System.out.println("factorial is not defined for negative numbers.");
        }
        else{
            for(int i=1;i<=number;i++)
            {
                factorial=factorial*i; // Equivalent to factorial=factorial*i
            }
            System.out.println("factorial of " + number + " is: " + factorial);
            }
        }
    } 
    
    

