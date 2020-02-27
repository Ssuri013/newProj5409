public class Fibonacci
{
	public static void main(String[] args) {
		
	    for(int i =1; i<=5000; i++) {
	        long startTime = System.nanoTime();
            fibonnaci(i);
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);
	        System.out.println(duration);
        }
        
	}
		
	static long fibonnaci(int t) {
	    long one=1;
	    long two = 1;
	    for(int i=1; i<=t; i++) {
	        long temp = one + two;
	        one = two;
	        two = temp;
	    }
	    return two;
	}
	
}
