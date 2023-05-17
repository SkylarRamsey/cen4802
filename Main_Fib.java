package fibonacci;

public class Main_Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target = 10;
		
		System.out.println("The "  + target + 
				" term of the fibonacci sequence is: " + fibbify(10));

	}
	
	/**
	 * Given an int this method returns the fibonacci value of that term
	 * 
	 * 
	 * @param targetTerm the nth term to find the fibonacci value of
	 * @return the value of the nth term in the fibonacci sequence
	 */
	public static int fibbify(int targetTerm)
	{
		
		if(targetTerm < 2)
		{
			return targetTerm;
		}
		else
		{
			return fibbify(targetTerm - 1) + fibbify(targetTerm - 2);
		}
	}

}
