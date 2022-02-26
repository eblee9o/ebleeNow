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
 * class Student1s extends Person1 implements A,B
 * 
 * */

class Person1{
	//field
	String name;
	int age;
	int weight;
	
	//constructor
	Person1(){}
	Person1(String name, int age, int weight){
		
		this.name = name;
		this.age  = age;
		this.weight = weight;
	}
	//method
	void wash() {System.out.println("wash >>> ");}
	void study() {System.out.println("study >>> ");}
	void play() {System.out.println("play >>> ");}
	
}//Person1

interface Allowence11{ //�������̽��� �߻�޼ҵ常 ���� ����
	//field
	
	//������ �ȵǳ� ����� ���� -> ����� ���� public static final �ٿ��ָ� ��
	//�������̽� �� ��� ��� �ʵ�(����) public static final�̿�����
	public static final String aaa = "ko";
	public static final int bbb = 100;
	
	//method
	abstract void in(int price, String name);
	abstract void out(int price, String name);
	
} 
interface Train1{
	abstract void Train1(int Train1ing_pay, String name);
}

class Student1 extends Person1 implements Allowence11, Train1{
	
	//field

	//constructor
	Student1(){}
	Student1(String name, int age, int weight){
		super(name, age, weight);
	}
	
	//method
	public void in(int price, String name) {System.out.printf(" %s���Լ� %d �뵷�� �޾ҽ��ϴ�. >>> ",name, price);}
	public void out(int price, String name) {System.out.printf(" %d �ݾ��� �����߽��ϴ�. [����뵵 --> %s]%n >>> ", price, name);}
	public void Train1(int Train1ing_pay, String name) {System.out.printf(" [%s --> %d�� �ԱݿϷ�] >>> ", name, Train1ing_pay);}
	
	
}//Student1

public class Oop_Interface003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//1. ��ü����
		Student1 s1 = new Student1("ȫ�浿", 20, 85);

		//2. Ŭ������ �������̽��κ��� ���(Person1)�� ����(Allowence11, Train1)�� �� �޼���� ȣ���ϱ�
		s1.wash();
		s1.study();
		s1.play();
		s1.in(100000, "����");
		s1.out(5000, "lotto");
		s1.Train1(5000, "lotto");
		System.out.println();
 
		//3. ����ʵ� ����ϱ�
		System.out.println(s1.aaa);
		System.out.println(s1.bbb);
		
		System.out.println("main >>>>");
	}//main

}//class
