package Pack1;

public class MethodDiscussion {
    
    // Static method
    public static void Method1() {
        System.out.println("Static method - Method1");
        System.out.println("Static method - Method1");
        System.out.println("Static method - Method1");
    }

    // Non-static method
    public void Method2() {
        System.out.println("Non-static method - Method2");
        System.out.println("Non-static method - Method2");
        System.out.println("Non-static method - Method2");
        
        // Calling another non-static method using this
        this.Method3();
    }

    // Another non-static method
    public void Method3() {
        System.out.println("Non-static method - Method3");
        System.out.println("Non-static method - Method3");
        System.out.println("Non-static method - Method3");
    }

    public static void main(String[] args) {
        // Calling static method directly
        Method1();

        // Creating an object to call the non-static method
        MethodDiscussion obj = new MethodDiscussion();
        obj.Method2(); // This will also call Method3 using 'this'
    }
    
    public class variableDemo {
//    	Instance variable non static
    	
    	int instanceVar = 10;
    	
//    	Static variable
    	
    	static int staticVar = 20;
    	
//    	Local variable 
    	
    	int localVar = 30;
    	
    	public void displayVariables() {
    		System.out.println("Instance variable: " + this.instanceVar);
    		System.out.println("Static variable: " + staticVar);
    		System.out.println("Local variable: " + localVar);
    		
    		
    	}
    	
    	
 
    	}
}
