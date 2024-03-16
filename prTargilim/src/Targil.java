import java.uti.*;
public class Targil {
	private int num1;
	private int num2;
	private char tav;
	public Targil (int num1, int num2,
			char tav) {
		this.setNum1(num1);
		this.setNum2(num2);
		this.setTav(tav);
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public char getTav() {
		return tav;
	}
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	public void setTav(char tav) {
		if(tav == '+' || tav == '-' || tav == '/' || tav == '*' || tav == '%')
			this.tav=tav;
		else
			this.tav='+';
	}
	public double result() {
		double result = 0;
		if(this.tav == '+') 
		{
			result = this.num1 + this.num2;
		}
		
		if(this.tav == '-') 
		{
			result = this.num1 - this.num2;
		}
		
		if(this.tav == '/') 
		{
			result = (double)this.num1 / (double)this.num2;
		}
		
		if(this.tav == '*') 
		{
			result = this.num1 * this.num2;
		}
		
		if(this.tav == '%') 
		{
			result = (double)this.num1 % (double)this.num2;
	}
		return result;
}
	public String toString() {
		System.out.println(this.num1+ this.tav+ this.num2+"="+this.result());
	}
}
