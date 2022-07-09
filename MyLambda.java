import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface chekerOutput{
	
	boolean checkNum(int x);
}

public class MyLambda {

	public static void main(String[] args) {
		
		///* Lista creada para hacer pruebas
		 //*
		 List <Integer> numList=new ArrayList<Integer>();
		 
		 for (int i=-20; i<700;i++) {
			
		 	numList.add(i);
		 }
		//*/
		
		checker(numList);
		//checker(Arrays.asList(4,5,898,34));
		//checker(Arrays.asList(0));
	}
	
	public static void checker(List <Integer> numList) {
		
		chekerOutput isOdd=x->(x>0&&x%2==0);
		chekerOutput isPrime=x->isPrime(x);
		chekerOutput isPalindrome=x->(x>0&&new StringBuffer(String.valueOf(x)).reverse().toString().equals(String.valueOf(x)));
		
		System.out.println("input:"+numList);
		System.out.println("output:[");
		
		for (Integer num:numList) {
			

			if (num==0) {
				System.out.println("\t NOT A POSSIBLE OPTION");
			}
			else {

				System.out.println("\t{");
				System.out.println("\t input: "+num);
				System.out.println("\t isOdd: "+isOdd.checkNum(num));
				System.out.println("\t isPrime: "+isPrime.checkNum(num));
				System.out.println("\t isPalindrome: "+isPalindrome.checkNum(num));
				System.out.println("\t}");
			}
		}
		
		System.out.println("]");
	}
	
	public static boolean isPrime(int x) {
		
		int i=3;
		
		boolean result=x>1&&!(x%2==0&&x!=2);

		while(result&&i*i<=x) {
			
			result=!(x%i==0);

			i+=2;
		}
		return result;
	}
}
