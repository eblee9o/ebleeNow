package javaStudy;

import java.util.Arrays;

public class MethodTwoReturn002 {
	
	public static String[] capitalMethod(String a, String b) {
		
		String a_ = a.toUpperCase();
		String b_ = b.toLowerCase();
		
		System.out.println(">>>" + a_ +", "+ b_);
		
		//���ϰ� 2���� ������ �迭 ���� ����
		String[] ret = {a_,b_};
		
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��ȯ�� o, �޴� ���ڰ� o :: �޼��� ȣ�⿡ ���� ���ϰ��� �ִٴ� �� --> ȣ��ο��� ���ϰ��� �޴� ���� ����		
		String[] result = capitalMethod("korea","USA");
		
		//���
		System.out.println(" >>> " + result);
		System.out.println(" >>> " + result[0]);
		System.out.println(" >>> " + result[1]);
		System.out.println(Arrays.toString(result));
		
	}//main

}//class
