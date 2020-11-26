package java_wk5;

public class SpacedLogger implements Logger{
	
	//3. 2/2 classes which implement Logger interface
	//6,7,8 Log and Error methods modify string and print to console

	@Override
	public void Log(String string) {
		int i;
		StringBuilder logString = new StringBuilder();
		for (i = 0; i < string.length(); i++) {
			logString.append(string.charAt(i) + " ");
		}
		System.out.println(logString);
	}

	@Override
	public void Error(String string) {
		String errorString = ("ERROR: " + string);
		Log(errorString);
		
	}	

}
