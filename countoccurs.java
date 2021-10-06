import java.util.Scanner;

public class countoccurs
{
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	int[] keepCounting = new int[100];
	System.out.println("Enter number");
	int numbers = scanner.nextInt();
	
while(numbers!=0)
{
	keepCounting[numbers]++;
	numbers = scanner.nextInt();
}
for(int i=0;i<keepcounting.length;i++)
{
	if(keepCounting[i]!=0)
	{
		System.out.println((i+1) + "occur" + keepCounting[i] + (keepCounting[i]>1 ?"times" : "time"));
}
}
