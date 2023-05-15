package fibonacci;

public class Main_Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target = 10;
		
		System.out.println("The "  + target + 
				" term of the fibonacci sequence is: " + fibbify(10));

	}
	
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
