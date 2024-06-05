package encapsulation;

public class BankPin {
	private int pin;
	public void setter(int pin)
	{
		this.pin=pin;
	}
	public void getter()
	{
		if(pin==1001 || pin==1234 || pin==1212)
		{
			System.out.println("Pin entered successfully");
		}
		else
		{
			System.out.println("invalid pin,try again");
		}
	}

}
