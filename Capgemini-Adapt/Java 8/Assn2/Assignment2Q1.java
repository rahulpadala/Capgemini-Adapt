package Assn2;


class SingletonInheritanceCheck
{ 
    
    private static SingletonInheritanceCheck single_instance = null; 

    public String s; 
  
    private SingletonInheritanceCheck() 
    { 
        s = "Hello I am a string part of Singleton class"; 
    } 
  
    
    public static SingletonInheritanceCheck getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new SingletonInheritanceCheck(); 
  
        return single_instance; 
    } 
} 
  

class Assignment2Q1
{ 
    public static void main(String args[]) 
    { 
    
    	SingletonInheritanceCheck x = SingletonInheritanceCheck.getInstance(); 
  
    
    	SingletonInheritanceCheck y = SingletonInheritanceCheck.getInstance(); 
  
  
    	SingletonInheritanceCheck z = SingletonInheritanceCheck.getInstance(); 
  
        x.s = (x.s).toUpperCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
        System.out.println("\n"); 
  
      
        z.s = (z.s).toLowerCase(); 
  
        System.out.println("String from x is " + x.s); 
        System.out.println("String from y is " + y.s); 
        System.out.println("String from z is " + z.s); 
    } 
} 