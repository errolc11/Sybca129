package sybca129Project;

public class add2nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=5;
		int num2=7;
	        int sum = addNumbers(num1,num2);
		System.out.println("Sum:"+sum);
	        int sub = subtractNum(num1,num2);
		System.out.println("Difference:"+sub);
	}
	public static int addNum(int a , int b){
		return a+b;
	}
	public static int subtractNum(int a,int b) {
		return a-b;
	}

}
