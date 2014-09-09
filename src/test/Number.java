package test;

public class Number {
	private int number;
	
	public Number(){
		this.number = (int) Math.random();
	}
	
	public int getNumber(){
		return this.number;
	}
}
