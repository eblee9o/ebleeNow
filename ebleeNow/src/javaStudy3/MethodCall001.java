package javaStudy;
/*call by value : ���� ���� ȣ�� >> �� ��ü�� ������~!
 *>> ���� ���� �ٷ� ���� ������ ���� ó���ϰ��Ѵ�.
 *>> �޼���� ���ڰ��� �ѱ� �� �ش� ���� �����Ͽ� �ѱ�� ���
 *���� */

public class MethodCall001 {
	public static void sum(int a) {
		a += 400;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		sum(a);
		System.out.println(a);
		
	}//main

}//class
