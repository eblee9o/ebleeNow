package javaStudy;
/*
 * �� ��ȯ�� �ʿ��Ѱ�?
 * ���ڳ����� ������ 3������, ���ڿ������� ������ 12�� �Ǳ⶧���� ���ڷ� ��ȯ �� ������ �����ؾ��Ѵ�.
 * ���ڿ��� ���ڷ� ��ȯ��Ű�� ��� : ParseInt
 * ParseInt : Integer ũ�������� static ���� ���� -> ���� ��ü�� �������� �ٷ� "Ŭ������.parseInt"�� ���� ����� ����
 * */
public class OopParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ڳ����� ����
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println("a+b = " + c);
		
		//���ڿ������� ����
		String a1 = "1";
		String b1 = "2";
		String c1 = a1 + b1;
		System.out.println("a1+b1 = " + c1);
		
		//���ڿ��� ���ڤ� ��ȯ �� ����
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		int c2 = a2+b2;
		System.out.println("parseInt >>> " + c2);
	
	}//main

}//class
