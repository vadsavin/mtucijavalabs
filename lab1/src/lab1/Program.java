package lab1;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Program {
	private static Scanner myInput;
	
	public static void main(String[] args) {
		myInput = new Scanner( System.in );
		
		//Z1();
		//Z2();
		//Z3();
			
		 myInput.close();
	}
	
	private static void Z1() {
	     int v = myInput.nextInt();
	     System.out.print(v%10);
	}
	
	private static void Z2() {
	     int v = myInput.nextInt();
	     if (v > 999) return;
	     System.out.print(v%1000/100+v%100/10+v%10);
	}
	
	private static void Z3() {
	     int v = myInput.nextInt();
	     
	     System.out.print(v > 0 ? ++v : v);
	}
	
	private static void Z4() {
	     int min = myInput.nextInt();
	     int current = myInput.nextInt();
	     if (current < min) min = current;
	     current = myInput.nextInt();
	     if (current < min) min = current;
	     
	     System.out.print(min);
	}
	
	private static void Z6() {
	     int v = myInput.nextInt();
	     
	     String sign = "";
	     String even = v%2==0 ? "??????" : "????????";
	     
	     if (v < 0) sign = "????????????? ";
	     else if (v > 0) sign = "????????????? ";
	     else {
	    	 sign = "???????";
	    	 even = "";
	     }
	     
	     System.out.print(sign + even);	     
	}
	
	private static void Z7() {
	     String key = myInput.nextLine();
	     
	     HashMap<String, String> map = new HashMap<String, String>();
	     map.put("905", "??????: 41.5");
	     map.put("194", "??????: 19.8");
	     
	     String v = map.getOrDefault(key, null);
	     
	     if (v == null) System.out.print("Unknown code!");
	     else System.out.print(v);
	}
	
	private static void Z8() {
	     //????, ?? ???? ???? - ??????.
	}
	
	private static void Z9() {
	   int[] array = new int[] {15,10,51, 6, 5,3, 10,-34,0,32,56, 12,24, 52};  
	   for(int i = 0, j=array.length; i<j; i++, j--) {
		   int c = array[i];
		   array[i] = array[j];
		   array[j] = c;
	   }
	   
	   System.out.print(Arrays.toString(array));
	}
	
	private static void Z10() {
		   int[] array = new int[] {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,52};  
		   int zeroCount = 0;
		   for(int i = 0; i < array.length-zeroCount; i++) {
			   if (array[i] == 0) {
				   int index = array.length - ++zeroCount;
				   int c = array[index];
				   array[index] = array[i];
				   array[i] = c;
			   }
		   }
		   
		   System.out.print(Arrays.toString(array));
		}
}
