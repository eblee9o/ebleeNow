package javaStudy;

public class MethodTwoReturn {
	
	public static int[] testMethod() {
		
		int num1 = 100;
		int num2 = 200;
		
		//���ϰ��� �ϳ��� ���� �� �ֱ� ������ �迭�� �־ �ּҰ��� �����ش�.
		return new int[] {num1,num2} ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��������
		int result[] = testMethod();
		
		//���
		System.out.println(">>>" + result);
		System.out.println(">>>" + result[0]);
		System.out.println(">>>" + result[1]);
		
		
	}//main

}//class
