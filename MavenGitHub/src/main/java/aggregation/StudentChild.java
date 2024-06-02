package aggregation;

public class StudentChild {
	StudentParent reference;
	String house;
	String place;
	
	public StudentChild(StudentParent reference,String house,String place)
	{
		this.reference=reference;
		this.house=house;
		this.place=place;
		
	}
	public void display()
	{
		System.out.println(reference.name+" "+reference.rollno+" "+house+" "+place);
	}

	public static void main(String[] args) {
		
		StudentParent objparent=new StudentParent("Shaharbanu",1234);
		StudentChild obj=new StudentChild(objparent,"Chandroth","Kannur");
		obj.display();

	}

}
