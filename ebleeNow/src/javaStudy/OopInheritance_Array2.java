package javaStudy;
/*�θ�Ŭ���� : Person
 * �ڽ�Ŭ���� : Villain, Hero*/
class Person4{
	
	//field
	String name;
	int age;

	
	//Constructor
	Person4(){}
	Person4(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	//Method - Ŭ���� �ۿ��� �� ���� �߰��� ���޹޾Ƽ� ��ü�� ��������(�־���)
	public void setName(String name) {this.name = name;	}
	public String getName() {return name;}
	
	public void setAge(int age) {this.age = age;}
	public int getAge() {return age;}
		
}//Person


class Villain4 extends Person3{}
class Hero4 extends Person3{}

public class OopInheritance_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ü����
		//Person Ÿ���� ��ü �迭 ���� pa4����
		//Person4 ��ü�� �������� ���ҷ� ������ �迭 ������ 5�� ���� --> 5�� ��ü �������״� �ּ� �����ض�
		Person4[] pa4 = new Person4[5];
		
		//�ݺ����� ���鼭 Person4()��ü ����
		for(int i = 0; i<pa4.length; i++) {
//			pa4[0] = new Person4("ȫ�浿", 20);
			pa4[i] = new Person4(i+"�� �ĺ���", i+20);
			
			//���
//			System.out.println(pa4[i].getName());
//			System.out.println(pa4[i].name+"�� ���̴� "+pa4[i].age+"�� �Դϴ�.");
			System.out.printf("%s�� ���̴� %d�� �Դϴ�. %n",pa4[i].name,pa4[i].age);
		}//for
		
	
	}//main

}//class
