public class Patternprogram {
    public static void main(String[] args){

        //pattern1
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }


        //pattern2
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }


        //pattern3
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        //pattern4
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        
        //pattern5
        for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        
        //pattern6
        int j=1;
        for(int i=1;i<=5;i++)
        {
            for(;j<=i*5;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }

        //task pattern
         j=2;
        for(int i=1;i<=5;i++)
        {
            for(;j<=i*10;j++)
            {
                System.out.print(j +" ");
                j++;
            }
            System.out.println();
        }
        for(int i=2;i<=6;i++){
            for(j=1;j<=i;j++){
                
                System.out.print("*");
                
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            for( j=i;j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=3;i>=1;i--){
            for( j=1;j<=i;j++){
                System.out.print("#");
            }
            
            System.out.println();
        }
        //pattern 7
        
        }
        
    }

    

