package javaStudy4;

/*�������� ����ϸ� �迭�̳� �Ű����� Ȱ�뿡���� ���� ����
 * */

class PersonP{}
class Batman extends PersonP{}
class Human{}
class Superman extends Human{}

public class Oop_polymorphism006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. �迭���� �������� ����� �� ���ٸ�
		//�迭 -> ������ Ÿ���� �����͸� �ϳ��� ��� �����ϴ� �ڷᱸ�� -> �������� ���ٸ� �� ��ü���� ���� �ؾ��Ѵ�.
		PersonP[] persons = new PersonP[10];
		persons[0] = new PersonP();
		persons[1] = new PersonP();
		
		Batman[] batman = new Batman[10];
		batman[0] = new Batman();
		batman[1] = new Batman();
		
		//�迭���� �������� ����Ҽ� �ִٸ� >>
		Human[] humans = new Human[10];
		humans[0] = new Human();
		humans[1] = new Superman();
		
		
	}//main

}//class
