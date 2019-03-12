



public class Procenty { 

   public static void main(String[] args) {
   
   int number = 5;
   int finishNumber = 20;
   
   while(number <= finishNumber) {
   	if(!isEvenNumber(number)) {
   		number++;
   		continue;
   	}
   	System.out.println("Even number " + number);
   	number++;
   }
  }
   	
   public static boolean isEvenNumber(int n) {
   	 
   	 if( n % 2 == 0) {
   	 	return true;
   	 } else {
   	
   	 	return false;
   	 }
   }
 }
   	    	   	    	
   
