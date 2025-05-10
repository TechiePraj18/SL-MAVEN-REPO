package demo.sl;

public class MyCalc {
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int diff(int a, int b)
	{
		return a-b;
	}
	public int mul(int a, int b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	public int mod(int a, int b)
	{
		return a%b;
	}
	public void greet()
	{
		System.out.println("Welcome Master Branch");
	}
	public void check()
	{
		System.out.println("Checked the pipeline");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalc calc = new MyCalc();
		System.out.println("Sum is : "+calc.sum(20,10));
		System.out.println("Diff is : "+calc.diff(20,10));
		System.out.println("Mul is : "+calc.mul(20,10));
		System.out.println("Div is : "+calc.div(20,10));
		System.out.println("Mod is : "+calc.mod(20,10));
		calc.greet();
		calc.check();
	}

}
