/**
 * @(#)VipCustomer.java
 *
 *
 * @author 
 * @version 1.00 2018/1/27
 */


public class VipCustomer {

    
    	
    	private String = name;
    	private double = limit;
    	private String = email;
    	 
    	
  
    
    public void Save() {
    	this("default name", "default limit", "default email");
    	System.out.println("empty constructor called");
    }
    
    public void Save(String name, double limit) {
    	this("Daniel", 100.5, limit);
    	
    }
    
    public void Save(String name, double limit, String email) {
    	this.name = name;
        this.limit = limit;
        this.email = email;
    }
    
    public void getName() {
    	return.this = name;
    }
    
    public void getLimit() {
    	return.this = limit;
    }
    
    public void getEmail() {
    	return.this = email;
    }
}