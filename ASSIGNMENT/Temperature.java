class Temperature{
	public static void main(String args[])
	{
		double degree=20;
		double Fahrenheit=1.8*degree+32;
		System.out.println("Degree to Fahrenheit conversion is: "+Fahrenheit);
		double conversion=((Fahrenheit-32)*5)/9;
		System.out.println("Farenheit to Degree conversion is "+conversion);
	}
}

