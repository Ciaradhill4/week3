package assignment;

import java.util.Arrays;

public class ArrayAndMethod {

	public static void main(String[] args) {
	  System.out.println("Question 1");	
		
		int [] ages = {3, 9, 23, 64, 2, 8, 28, 93, 22};
		
		int firstMinusLast = (ages[ages.length -1] - ages[0]); 
		System.out.println(firstMinusLast); 
		System.out.println();
		System.out.println();
		
	 int sum = 0;
		for (int age : ages) {
		   sum += age;
		}
			System.out.println(sum);
		
		int average = sum / ages.length;
		 System.out.println(average);
		
	System.out.println("Question 2");
		 
		 String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		 
		 int sumOfLetters = 0;{ 
		 for (String name : names) {
			 sumOfLetters += name.length();
		 }
			 System.out.println(sumOfLetters);
		 }
		 
		 System.out.println("Question 5");
		 int [] nameLengths = new int[names.length]; 
		 	for (int i = 0; i < names.length; i++) {
		 		nameLengths[i] += names[i].length();
		 		System.out.println(Arrays.toString(nameLengths));
		 	}
		 		
		   for (String name : names){
			   System.out.println(name);
		}	 
		 
		System.out.println("Question 6");   
		 int sumOfElements = 0; 
		  for (int x : nameLengths) {
		   sumOfElements += x; 
		  }
		    System.out.println(sumOfElements);
		  
		 
	System.out.println("Question 7");

		 System.out.println(mulitplyString("Hello", 3));  
		
	System.out.println("Question 8");
	
		 String firstName = "Ciara";
		 String lastName = "Jinkins";
		 String fullName = (firstName + " " + lastName);
		System.out.println(fullName);
		 
	System.out.println("Question 9");

	if (sum > 100) {
	  System.out.println(true);
	}else {
		System.out.println(false);
	}
		
	System.out.println("Question 10");
	
		double[] elements  = { 50.2, 20.3, 16.8};
		System.out.println(calculateAverage(elements));
	
	System.out.println("Question 11");
	
	 double[] elements2 = {5.1, 25.2, 8.6};
	System.out.println( firstArrGreaterAvgOrLess(elements, elements2));

	
  System.out.println("Question 12");
  
	
}
	//create methods here
	//7
	public static String mulitplyString(String str, int num){ 
		int sum = 0; 
		String result = " "; 
		 for (int i = 0; i < num; i++){ 
		  result += str; 
		} 
		return result; 
	}
		
	//10
		public static double calculateAverage(double[]array) { 
				double sum = 0; 
				 for (double x : array){ 
					 sum += x;
				 }
				 	return sum/array.length ;
		}
		
		//11 
	public static boolean firstArrGreaterAvgOrLess(double[] arr1, double[] arr2) {			
		double sum1 = 0;	
		double sum2 = 0;
			   for (double x1 : arr1) {
				sum1 += x1;
			}
				for (double x2 : arr2) {
					sum2 += x2;
				}
	if ((sum1 / arr1.length) > (sum2 / arr2.length)) {
			return true;
	}
			return false;
	}
  
	//12
	public static void willBuyDrink(boolean[] isHotOutside, double[] moneyInPocket) {
		
		
		}
		
}
