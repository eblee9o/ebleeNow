package javaStudy;

public class MethodCall002 {
//call by reference���
	
	public static void sum(MethodCall002 rst) {
		
	System.out.println("sum �޼��� �ȿ��� ��� >>> " + rst);	
	
	}
	
	public static void sum2(int[] rst) {
		
		System.out.println("sum2 �޼��� �ȿ��� ��� >>> " + rst);	
		
		}
	
	public static void sum3(Integer d) {
		
		System.out.println("Integer �޼��� �ȿ��� ��� >>> " + d);	
		
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call by value
		int a = 100;
//		sum(a);
//		System.out.println("result >>>> " + a);
		
		// 1. ���� ���� �� �޼��� ȣ��
		//Wrapper Ŭ������ int Ŭ���� Ÿ������ ���� a�� �����ϰ� new�� ��ü�� �����Ͽ� �ش� �ּ� ���� �޼���� ������.
		int[] b = new int[5];
		MethodCall002 c = new MethodCall002(); //������ Ÿ������ ����
		
		sum(c);
		sum2(b);
		
		System.out.println("main �޼��� �ȿ��� c ��� >>> " + c);
		System.out.println("main �޼��� �ȿ��� b ��� >>> " + b);
		
		Integer d = new Integer(100);
		sum3(d);
		System.out.println("integer a >>> " + d);
	}//main

}//class
