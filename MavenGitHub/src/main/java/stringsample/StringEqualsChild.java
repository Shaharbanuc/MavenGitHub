package stringsample;

public class StringEqualsChild extends StringEqualsParent
{
	public void display()
	{
		System.out.println(super.s1);
		super.stringEquals();
	}

	public static void main(String[] args)
	{
		
		StringEqualsChild obj=new StringEqualsChild();
		obj.display();
	}

}
