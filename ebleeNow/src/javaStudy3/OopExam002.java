package javaStudy;

class FarmMachine2{
	
	//1. �Ӽ�(Ư¡)
	int price; 		//����
	int year; 		//����
	String color; 	//����
	
	//2. ����/���/�ൿ(Method) --> ���踶�� ������ �پ��� ���̹Ǥ� ó������ �������� ������ �����غ���.
	void move() {
		System.out.println(" move >>> ");
		
	}
	void dig() {
		System.out.println(" dig >>> ");
		
	}
	void grind() {
		System.out.println(" grind >>> ");
		
	}
	
}//FarmMachine
public class OopExam002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ü���� : ��ġ�� �����
		FarmMachine2 fm = new FarmMachine2();
		System.out.println(" ��ü �ּ� >> " + fm);
		
		//������ ��ü�� �Ӽ� �� �Է��ϱ�
		fm.price = 1000000000;
		fm.year = 2;
		fm.color = "red";
		
		//�Ӽ��� ����ϱ�
		String fm_price = String.format("%,d", 1000000000); //õ������ ��� ���
	
		System.out.println(fm_price);
		System.out.println(fm.price);
		System.out.println(fm.year);
		System.out.println(fm.color);
		
		//���ۼ����ϱ�
		fm.move();
		fm.dig();
		fm.grind();

	}//main


}//class
