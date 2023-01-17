import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    //Scanner class is used to take the input from the STDIN 
		Scanner sc = new Scanner(System.in);
		//lower & upper variables is intialised
		int n = sc.nextInt();
		int m = sc.nextInt();
		//result prime numbers are stored into an ArrayList :)
		ArrayList<Integer>res = findPrimes(n, m);
		//printing the primes using enhanced loop -->for Each loop
		for(Integer val : res)
		System.out.print(val+" ");
		sc.close();
	}
	
	public static ArrayList<Integer> findPrimes(int p, int q)
	{
	    //primes ArrayListis declared to store the primes
	   ArrayList<Integer> primes = new ArrayList<>();
	    for(int i = p; i <= q; i++)
	    {
	        //Here, again we are calling another method called isPrime
	        //tocheck if a number is a prime or not 
	        if(isPrime(i))
	            primes.add(i);
	    }
	    return primes;
	    
	}
	public static boolean isPrime(int num)
	{
	    if(num <= 1)
	        return false;
	   else if(num%2 == 0)
	        return false;
	   else if(num == 2)
	        return true;
	        //primes exist between 2 and square root of its number 
	   for(int i = 3; i <= Math.sqrt(num); i++)
	   {
	       if(num%i == 0)
	        return false;
	   }
	   return true;
	}
	    
}
