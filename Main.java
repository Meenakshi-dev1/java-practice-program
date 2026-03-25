public class Main
{
public static void main(String[] args)
{
int a=10;
int b=20;
int c=a+b;
System.out.println(c);
for(int i=1;i<=5;i++)
{
    for(int k=4;k>=i;k--)
    {
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++)
    {
        System.out.print("*");
    }
    System.out.println();
}
for(int i=1;i<=5;i++)
{
   for(int j=1;j<=5;j++) 
   {
    System.out.print("*");
   }
   System.out.println();
}
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print(i);
    }
    System.out.println();
}
for(int i=1;i<=5;i++)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print(i);
    }
    System.out.println();
}
for(int i=5;i>=1;i--)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print(i);
    }
    System.out.println();
}
for (int i=5;i<=1;i--)
{
    for(int j=1;j<=5;j++)
    {
        System.out.print(i);
    }
    System.out.println();
}
int num=5;
int fact=1;
for(int i=1;i<=num;i++)
{
    fact=fact * i;
}


System.out.println("Factorial is:" + fact);
 int h=0,j=1,l;
System.out.print(h+" "+j+" ");
for(int i=1;i<=8;i++)
{
    l=h+j;
    System.out.print(l+" ");
    a=b;
    b=c;
    
}
}
}
