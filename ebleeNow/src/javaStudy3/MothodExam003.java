package javaStudy;

public class MothodExam003 {

/*��ȯ���� �ְ� �޴� ���ڰ��� ���� �޼��� ����
 * �ڹ��� �޼��� �ۼ����� ��ȯ��, ���ڰ��� ���� ����
 */	

	public static int returnMethod() {
		
		int ret = 10;
		ret *= 2;
		
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. ��ȯ�� o, �޴� ���ڰ� X : ��ȯ���� �ִٴ� ���� �޼���(�Լ�) ȣ�⿡ ���� ���ϰ��� �ִ� ���̹Ƿ� ȣ�� �� ���ϰ��� �޴� ������ �����Ѵ�.
		int rst;
		
		rst = returnMethod();
		
		//2. ���
		System.out.println("�޼��� ȣ�⿡ ���� ���ϵ� ���� = " + rst);
		
	}//main

}//class
