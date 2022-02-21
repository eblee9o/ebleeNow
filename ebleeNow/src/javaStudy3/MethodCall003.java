package javaStudy;

class TestNumber{
	int num;
	TestNumber(int num){
		this.num = num;
		System.out.println(num);
	}
}
public class MethodCall003 {

	public static int sum(int rst) {
		
		rst += 400;
		System.out.println(rst);//500
		
		return rst;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call by value
		int a = 100;
		sum(a);
		
		//call by reference
		TestNumber tn= new TestNumber(100);
		sum(a);
		
	}//main

}//class
