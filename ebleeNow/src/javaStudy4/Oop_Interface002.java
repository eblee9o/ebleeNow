package javaStudy4;
/*�������̽�
 * �߻�Ŭ������ ���� ����ϳ� �� �߻�ȭ ������ �� ����(�� ����) -> �Ϲ� �޼��峪 ����ʵ�(����)�� ���� �� ����.
 * ǥ��ȭ �� �԰��� �������̽��� ���� -> ������ "���赵"����
 * ���� � Ŭ������ �ش� �������̽��� ���(���)�Ѵٸ� �������̽��� ����Ǿ��� �ִ� �޼��带 ����
 * interface Ű���� ���
 * �߻�Ŭ������ ���� �޼����� ��ü���� ������ ����Ǿ��� ���� �����Ƿ� �������̽��� ��ӹ��� Ŭ�������� ������(�������̵�)�Ͽ� ���
 * 
 * ���
 * Ŭ���� - ���ϻ�Ӹ� ���� / extends
 * �������̽� - ���߻�� �ڴ� / implements, ���߻�� �� ,�� �и�
 * �̸� �̿��Ͽ� �������� �������̽����� �޼��带 �޾ƿ� �� �ְԵȴ� -> ���߻�� ����
 * 
 * ����
 * �������̽��� �̿��ϸ� �޼����� �߻����� "����"�� �� �޼������ ��ü���� "����"�κ��� �и���ų �� �ִ�. -> �ſ� ū ����
 * ��û�� �ִ� ����(��)�� ��û��ü(��)�� �������̽��� ���� -> �� ��û��ü���� �̸� �ؼ��Ͽ�(=��ӹ޾�) ����
 * �о�ȭ�� �ý����� �����Ͽ� "��"�� "��"�� ���������� ������Ʈ ������ �س��� �� �ִ�. -> �ſ� ū ����
 * 
 * �켱����(extends vs implements)
 * ����� �޴� extends Ű����� ������ �ϴ� implements Ű���尡 ���ÿ� ���� �� ->extends Ű���尡 �׻� ���� ���δ�.
 * class Students extends Person implements A,B
 * 
 * */

class Person{
	//field
	String name;
	int age;
	int weight;
	
	//constructor
	Person(){}
	Person(String name, int age, int weight){
		
		this.name = name;
		this.age  = age;
		this.weight = weight;
	}
	//method
	void wash() {System.out.println("wash >>> ");}
	void study() {System.out.println("study >>> ");}
	void play() {System.out.println("play >>> ");}
	
}//person

interface Allowence{ //�������̽��� �߻�޼ҵ常 ���� ����
	abstract void in(int price, String name);
	abstract void out(int price, String name);
	
} 
interface Train{
	abstract void train(int training_pay, String name);
}

class Student extends Person implements Allowence, Train{
	
	//field

	//constructor
	Student(){}
	Student(String name, int age, int weight){
		super(name, age, weight);
	}
	
	//method
	public void in(int price, String name) {System.out.printf(" %s���Լ� %d �뵷�� �޾ҽ��ϴ�. >>> ",name, price);}
	public void out(int price, String name) {System.out.printf(" %d �ݾ��� �����߽��ϴ�. [����뵵 --> %s] >>> ", price, name);}
	public void train(int training_pay, String name) {System.out.printf(" [%s --> %d�� �ԱݿϷ�] >>> ", name, training_pay);}
	
	
}//student

public class Oop_Interface002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//��ü����
		Student s1 = new Student("ȫ�浿", 20, 85);

		
		
		System.out.println(">>>>");
	}//main

}//class
