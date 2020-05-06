import java.util.*;
class Bprime
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter any value");
int f=sc.nextInt();
boolean isPrime=true;
for(int i=2;i*i<=f;i++)
{
if(f%i==0)
{
isPrime=false;
break;
}

}
if(f<2)
isPrime=false;

System.out.println("Number Is Prime a nnumber :"+isPrime);
}
}