package java_wk5;

public class AsteriskLogger implements Logger{

	//3. 1/2 classes which implement Logger interface
	//4,5 both Log and Error methods take in a string and print to console
	
	@Override
	public void Log(String string) {
		System.out.println("***" + string + "***");
		
	}

	@Override
	public void Error(String string) {
		System.out.println("********************");
		System.out.println();
		System.out.println("***Error: " + string + "***");								
		System.out.println();
		System.out.println("********************");
	}
	
	

}
