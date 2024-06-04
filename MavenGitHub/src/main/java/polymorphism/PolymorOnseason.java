package polymorphism;

import java.util.Scanner;

public class PolymorOnseason extends PolymorOffseason {
	float total;
	float rate=2500.00f;
	String season="onseason";
	int i;
	
	public void discount()
	{
		if(i==1)
		{
		total=rate-(rate*0.15f);
		System.out.println("The bill amount is "+total);
		}
		else
		{
			super.discount();
		}
	}

	public static void main(String[] args) {
		
		PolymorOnseason obj=new PolymorOnseason();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for onseason and 2 for offseason");
		obj.i=sc.nextInt();
		obj.discount();
		
	}

}
