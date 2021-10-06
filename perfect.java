
import java.util.*;
public class perfect 
{
public static void main(string args[])
{
int n=6,i,rem,sum=0;
for(i=1;i<n-1;i++)
{
remo=n%i;
if(rem==0)
{
	sum=sum+i;
}
if(sum==n)
{
System.out.println("\n\t given number is perfect number=" +n);
}
else
{
	System.out.println("\n\t given number is not perfect number ",+n);
}
}
}
}
