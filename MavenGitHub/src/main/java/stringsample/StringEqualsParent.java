package stringsample;

public class StringEqualsParent {
	String s1="hello";
	String s2=new String("hello");
	String s3="hello";
	public void stringEquals()
	{
		System.out.println("==used to compare the referance of two objeact in java");
		
		System.out.println(s1==s2);
		
		System.out.println("eqauals method compares two strings & returns true if both are equal");
		System.out.println(s1.equals(s3));
	}

}
