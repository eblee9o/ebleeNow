package javaStudy4;
/*�ڽ� ũ������ �����ϴ� ��ü�� �θ��� Ÿ������ �޾Ƽ� ��ü�� �����ϸ� �������� ��� �Ǵ��� ���غ��ÿ�
 * �������� ���迡�� �θ�, �ڽ� Ŭ���� �ڿ��� ��� �� �� �ִ����� ���� ����!
 * */
class PPerson1{
	String str1 = "�� �θ�Ŭ����";
	void method1() {System.out.println("aaaaa");}
	void ppp() {System.out.println("ppp");}
}
class SStudent1 extends PPerson1{
	String str2 = "�� �ڽ�Ŭ����";
	void method1() {System.out.println("�ФФФ�");}
	void sss() {System.out.println("sss");}
}
public class Oop_polymorphism002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ��ü���� : �θ�+�ڽ�Ŭ������ ��� �ڿ��� �� �� �ִ�.
		System.out.println("----------SStudent1 s1 = new SStudent1()----------");
		SStudent1 s1 = new SStudent1();
		System.out.println(s1.str1);
		System.out.println(s1.str2);
		s1.method1();
		s1.sss();
		s1.ppp();
		//�ڽ�Ŭ�������� �������̵��� �θ� Ŭ������ ���� �޼ҵ带 ȣ���ϰ� �ʹٸ�??
		
		
		
		//2. ��ü���� -> �θ�Ÿ������ ���� : �θ��� �ڿ����� �� �� �ִ�. (?)
		System.out.println("----------PPerson1 s2 = new SStudent1();----------");
		PPerson1 s2 = new SStudent1(); //����(�ڽ�)Ŭ������ ��ü�� ����鼭 Ÿ���� ����(�θ�) Ÿ���� ���� ���� ����
		System.out.println(s2.str1);
//		System.out.println(s2.str2);//err >>�θ�Ŭ������ �ڿ��� ��� ����
		s2.ppp();
//		s2.sss();//ERR
		s2.method1();//�������̵� -BBB -> �������̵� �� ���� �ڽ��� �޼���� ����

		//�ڽ�Ŭ�������� �������̵��� �θ�Ŭ������ ���� �޼��带 ȣ���ϰ� �ʹٸ�?
		
		
		
		//3. ��ü���� -> 
		System.out.println("----------PPerson1 p1 = new PPerson1();----------");
		PPerson1 p1 = new PPerson1();
		p1.method1();
//		p1.sss();
		
		
		

		
		//4. ��ü���� -> ����(�θ�)Ŭ������ ��ü�� �����ϸ鼭 Ÿ���� ����(�ڽ�)�� ���� ��� ->> ����
//		SStudent s2 = new PPerson(); //����!!
		
		

	}//main

}//class
