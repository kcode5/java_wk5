package java_wk5;

public class App {

	public static void main(String[] args) {
		
	//9 - 10 create a main method and instantiate instances of each logger class
	//that implement the Logger interface
	//11 test both methods on both instances
		
	Logger asteriskLogger = new AsteriskLogger();
	Logger spacedLogger = new SpacedLogger();
	
	asteriskLogger.Log("Hello");
	asteriskLogger.Error("Goodbye");
	
	spacedLogger.Log("Hello!");
	spacedLogger.Error("Goodbye!");	
		
	}

}
