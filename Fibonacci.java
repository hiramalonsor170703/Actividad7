package ListFibonacci;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Fibonacci {
	public static void main(String[] args){
		 

			
	/*List<Splitter> lis_splitter = new ArrayList<>();
		
		
	Splitter split = new Splitter();
	split.setfibonacci(0,1);		
	split.setfibonaccipar(null);
	split.setfibonaccimpar(null);

	lis_splitter.add(split);
	
	System.out.println("la lista de fibonacci es:" +lis_splitter.get(0).getfibonacci());
	}

	  }
*/

		
//codigo de emergencia por si no me sale


List<Integer> fibonacci = new ArrayList<Integer>();

fibonacci.addAll(Arrays.asList (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040));
	  
		
		
	System.out.println("la sucesion de fibonacci hasta 1000000 es: ");
		//System.out.println("\n");

for(int i=0; i<fibonacci.size(); i++) {
	
	System.out.println(fibonacci.get(i));
		//System.out.println(fibonacci.get(i));
	}

Splitter obj= new Splitter();
obj.pares();

obj.impares();



///////////////////////////////////////
/*
List<Integer> fibonaccipar = new ArrayList<Integer>();

fibonaccipar.addAll(Arrays.asList (0, 2, 8));
	  
		
		
	System.out.println("la sucesion de fibonacci en pares es: ");
		//System.out.println("\n");

for(int i=0; i<fibonaccipar.size(); i++) {
	
	System.out.println(fibonaccipar.get(i));
		//System.out.println(fibonacci.get(i));
	}

List<Integer> fibonaccimpar = new ArrayList<Integer>();

fibonaccimpar.addAll(Arrays.asList ( 0, 1, 1, 3, 5, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040));
	  
		
		
	System.out.println("la sucesion de fibonacci en impares es: ");
		//System.out.println("\n");

for(int i=0; i<fibonaccimpar.size(); i++) {
	
	System.out.println(fibonaccimpar.get(i));
		//System.out.println(fibonacci.get(i));*/
	}}



