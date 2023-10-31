package ListFibonacci;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Fibonacci {
	
public List<Integer> generarFibonacci() {
	        List<Integer> lista = new ArrayList<>();
	        int a = 0; 
	        int b = 1; 
	        int c = 0;
	        while (c <= 2000000) {
	            c = a + b;
	            a = b;
	            b = c;
	            if (c <= 2000000) {
	                lista.add(c);
	            }
	        }
	        return lista;
	         }
	}

