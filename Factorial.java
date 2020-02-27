
public class Factorial
{
	public static void main(String[] args) {
		for(int i =1; i<=20; i++) {
	        long startTime = System.nanoTime();
            factorial(i);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
	        System.out.println(duration);
	    }
	}
	
	static long factorial(int t) {
	    long result=2;
	    for(int i=3; i<=t; i++) {
	        result *= i;
	    }
	    return result;
	}	
}
