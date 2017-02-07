public class Runner
{
	public static void main(String[] args)
	{
	
		//STUDENT TESTS
		Student Miro = new Student();
		Student Drew = new Student(16);
		Student Jeremy = new Student("Jeremy");
		Student Tom = new Student("Tom", 15);
		
		System.out.println(Miro);
		System.out.println(Drew);
		System.out.println(Jeremy);
		System.out.println(Tom);
		
		System.out.println(Student.getOldest());
		
		Tom.hasBirthday();
		
		System.out.println("Happy " + Tom.getAge() + "th Birthday, " + Tom.getName());

		//FRACTION TESTS
		Fraction blank = new Fraction();
		System.out.println(blank);
		
		Fraction frac = new Fraction(1,2);
		System.out.println(frac);
		
		Fraction frac2 = new Fraction(2,3); 
		System.out.println(frac2); 

		System.out.print("Decimal of " + frac + " = ");
		System.out.println(frac.toDouble());
		
		System.out.print("Decimal of " + frac2 + " = ");
		System.out.println(frac2.toDouble());
		
		System.out.print("Reciprocal of " + frac + " = ");
		frac.inverse();
		System.out.println(frac);
		
		System.out.print("Reciprocal of " + frac2 + " = ");
		frac2.inverse();
		System.out.println(frac2);
   	    
		System.out.print(frac + " + " + frac2 + " = ");
		frac.plus(frac2);
		System.out.println(frac);
		
		System.out.print(frac + " - " + frac2 + " = ");
		frac.minus(frac2);
		System.out.println(frac);
		
		System.out.print(frac + " * " + frac2 + " = ");
		frac.times(frac2);
		System.out.println(frac);
		
		System.out.print(frac + " / " + frac2 + " = ");
		frac.divided(frac2);
		System.out.println(frac);
		
		System.out.print(frac2 + " > " + frac + " = ");
		System.out.println(frac2.compareTo(frac));
		
		System.out.print(frac + " > " + frac2 + " = ");
		System.out.println(frac.compareTo(frac2));
	}
}