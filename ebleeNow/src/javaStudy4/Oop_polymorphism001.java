package javaStudy4;
/*������
 * 
 * �������̶� �پ��� ���� �Ǵ� Ư���� �����ٴ� �ǹ�
 * �ڹٿ� ���� ��ü��������� �ǹ̴� �θ� Ŭ������ ��ӹ��� �ڽ�Ŭ������ �ν��Ͻ��� �θ��� ��ü�ε� ���ǰ�, 
 * �ڽ�Ŭ������ ��ü�ε� ���� �� �ִ� �پ��� ��Ȳ�� �ǹ��Ѵ�.
 * 
 * ����ũ������ �ν��Ͻ�(��ü)�� ���� ���� ����Ŭ������ �ν��Ͻ�(��ü)�ε� ���� �� �ִ�.
 * �ݴ�� �ȵȴٸ�
 *  >>����Ŭ���� = ����Ŭ���� / ����Ŭ���� = ����Ŭ����
 *  �� Student = Person
 *    Person =/= Student 
 *  
 * */

class PPerson{}
class SStudent extends PPerson{}
public class Oop_polymorphism001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. ��ü����
		SStudent s1 = new SStudent();
		
		//2. ��ü���� -> �θ�Ÿ������ ����
		PPerson s2 = new SStudent(); //����(�ڽ�)Ŭ������ ��ü�� ����鼭 Ÿ���� ����(�θ�) Ÿ���� ���� ���� ����
		
		//3. ��ü���� -> 
		PPerson p1 = new PPerson();
		
		//4. ��ü���� -> ����(�θ�)Ŭ������ ��ü�� �����ϸ鼭 Ÿ���� ����(�ڽ�)�� ���� ��� ->> ����
//		SStudent s2 = new PPerson(); //����!!
		
		
		
	}//main

}//class
