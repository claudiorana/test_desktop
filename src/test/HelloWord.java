package test;

public class HelloWord {
	
	private String toPrint;
	
	public HelloWord(String string){
		this.toPrint = string;
	}
	
	public void print() {
		System.out.println(this.toPrint);
	}
}
