package hackerrank.Java.Advanced;



class Singleton{
	
	public String str;
	private Singleton(){}
	private static Singleton instance = null;
	
	static Singleton getSingleInstance(){
		if(instance == null)
		{
			instance = new Singleton();
		}
		return instance;
	}
}
public class JavaSingletonPattern {

	public static void main(String[] args) {


	}

}
