public class fibonacci {
    public static void main(String[] args) {
        int count=10; // the number of terms to print
        int num1=0,num2=1;
        System.out.println("fibonacci series of" + count + " numbers:");
        for(int i=1;i<=count;i++)
        {
            System.out.println(num1);
        // compute the next term and shift the values
        int sumofprevTwo=num1+num2;
        num1=num2;
        num2=sumofprevTwo;
    }
}
}

