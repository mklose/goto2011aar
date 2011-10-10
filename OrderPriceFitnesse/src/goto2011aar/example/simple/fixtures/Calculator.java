package goto2011aar.example.simple.fixtures;

public class Calculator {
	
	private int a,b;
	
	public void setA(int a){
		this.a=a;
	}
	public void setB(int b){
		this.b=b;
	}
	
	public int plus(){
		return new goto2011aar.example.simple.Calculator().add(a, b); 
	}
}
