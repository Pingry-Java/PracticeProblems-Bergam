public class Student
{
	private String name; 
	private int age; 
	private static int oldestStudent = 0; //static because not applicable to every student
	
	//Constructors
	public Student()
	{	
		this("No name", 0); 
	}
	
	public Student(int age)
	{
		this("No name", age); 
	}
	
	public Student(String name)
	{
		this(name, 0); 
	}

	public Student(String name, int age)
	{
		if (age < 0)
			throw new IllegalArgumentException("Age of student must be positive.");
		this.name = name; 
		this.age = age; 
		if (this.age > oldestStudent)
			oldestStudent = this.age; 		
	}
	
	//accessors
	public String getName()
	{
		return name; 
	}
	
	public int getAge()
	{
		return age; 
	}
	
	public static int getOldest() //static for static field
	{
		return oldestStudent; 
	}
	
	//methods
	public String toString()
	{
		return name + " is " + age + " years old."; 
	}
	
	public int hasBirthday()
	{
		age++; 
		if (age > oldestStudent)
			oldestStudent = age; 
		return age; 
	}
	
	
}