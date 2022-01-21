import java.io.*;
public interface Logger {
	void Log(String s);
	void Error(String s);

}
class AsteriskLogger implements Logger{
	@Override
	public void Log(String s) {
		System.out.println ("***"+s+"***");
	}
	@Override
	public void Error(String s) {
		System.out.println("***************");
		System.out.println("***Error: "+s+"***");
		System.out.println("***************");
	}
}
class SpacedLogger implements Logger{
	@Override
	public void Log(String s) {
		String result="";
		for(int i=0; i<s.length(); i++) {
			result=result + s.charAt(i)+" ";
		}
		System.out.println(result);
	}

	@Override
	public void Error(String s) {
		String result="";
		for(int i=0; i<s.length(); i++) {
			result=result + s.charAt(i)+" ";
		}
		System.out.println("ERROR: "+result);
	}
		
		
}

class app{
	public static void main(String[] args) {
		AsteriskLogger al=new AsteriskLogger();
		al.Log("Hello");
		al.Error("Hello");
		SpacedLogger sl = new SpacedLogger();
		sl.Log("Hello");
		sl.Error("Hello");
	}
}
