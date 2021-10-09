import java.util.Scanner;

public static numberToWordconverter
{
	private static String numberToWordconverter(int a)
	{
		String word,"";
		String unitarray[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String tensarray[] = {"zero","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		
		if(q==0)
		{
			return "zero";
		}
		if(a<0)
		{
			String number = ""+a;
			number = number.substring(1);
			return "minus"+numberToWord(Integer.parseInt(number));
		}
		
		if((a/1000000)>0)
		{
			word = word+numberToWord(a/1000000)+"Million";
			a=a%1000000;
		}
		if((a/1000)>0)
		{
			word = word+numberToWord(a/1000)+"Thousand";
			a=a%1000;
		}	
		if((a/100)>0)
		{
			word = word+numberToWord(a/100)+"Thousand";
			a=a%100;
		}

		if(a>0);
		{
				if(a<20)
				{
					word = word+unitarray[a];
				}
				else 
				{
					word = word+tensarray[a/10];
					if((a%10)>0)
					{
						word = word+","+unitarray[a%10];
					}
				}		
		}
	return word;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("please type a number");
		number = sc.nextInt();
		if(number==0)
		{
			System.out.println("zero");
		}
		else
		{
			System.out.println("Number in words : "+numberToWord(number));
		}
	}
}
	
















		