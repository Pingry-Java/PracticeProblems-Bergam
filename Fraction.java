public class Fraction
{
	private int numerator;
	private int denominator;
	
	//Constructors
	public Fraction()
	{
		this(1,1);
	}
	
	public Fraction(int numer, int denom)
	{
		numerator = numer;
		denominator = denom;
	}
	
	//Accessors
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	//Methods
	public String toString()
	{
		return numerator + "/" + denominator;
	}
	
	
	public double toDouble()
	{
		return (double) numerator/denominator;
	}
	
	public void inverse()
	{
		int flip = numerator;
		numerator = denominator;
		denominator = flip;
	}
	
	public void times(Fraction frac)
	{
		denominator = frac.getDenominator() * denominator;
		numerator = frac.getNumerator() * numerator;
	}
	
	public void divided(Fraction frac)
	{
		frac.inverse();
		this.times(frac);
	}
	

	public void plus(Fraction frac)
	{
		numerator = (numerator * frac.getDenominator()) + (frac.getNumerator() * denominator);
		denominator = frac.getDenominator() * denominator; //common denominator
	}
	
	public void minus(Fraction frac)
	{
		numerator = (numerator * frac.getDenominator()) - (denominator * frac.getNumerator());
		denominator = frac.getDenominator() * denominator; //common denominator
	}

	public boolean compareTo(Fraction frac)
	{
		if (this.toDouble() > frac.toDouble())
			return true;
		return false;
	}


}