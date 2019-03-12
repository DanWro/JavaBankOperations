
public class Stat {

    public static void main(String[] args) {
    	
    	boolean gameOver = true;
    	int score = 10000;
    	int levelCompleted = 8;
    	int bonus = 200;
    	
    	  if(score < 9000 && score > 11000 ) {
    	  	System.out.println("You final score was less than 9000 but greater than 11000");
    	  
    	  } else if(score < 11000) {
    	  	System.out.println("Your score was less than 11000");
    	  } else {
    	  	System.out.println("Got there");
    	  }
    	
    	
    	
    }
    
    
}