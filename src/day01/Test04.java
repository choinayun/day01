package day01;

public class Test04 {

	public static void main(String[] args) {
		
		// ���� : �����͸� ���� �� �� �ִ� ���� 
		// �ڷ����� �����ؾ��� ������ ����� �� �ִ� 
		// �ڷ���(type) : ���ڸ� �������� ���ڸ� �������� ���ϴ�
		
		/*
		 bit : 2������ ���ڸ��� 1bit (bit���� 0,1) 
		 1byte : 8bit 
		 
		 
		 type   ũ��(byte)	  	����
		 -------------------------------
		 byte      1	    -128 ~ 127	
		 short     2	  -32768 ~ 32767
		 char  	   2 	       0 ~ 65535
		 int 	   4
		 float	   4
		 double    8
		 void	   ���� ���� �ʴ� Ư���� ������ ��
		  
		 */
		
		int age = 25; 		   // int : ����(��,���) ǥ��
		double weight = 55.0;  // �Ǽ��� ǥ��
		double height = 160.0; 
		
		System.out.println("���� ���̴� " + age + "��" );
		System.out.println("���� Ű�� " + height + "cm");
		System.out.println("���� ���Դ� " + weight + "kg" );
		
		
		// char ���� : �ϳ� ǥ���� �� ���
		// ���� �ϳ��� ���� ����ǥ�� ǥ���ؾ� �Ѵ�
		char ch = 'A';
		System.out.println("���� �� : " + ch);
		ch = 'B';
		System.out.println("���� �� : " + ch);
		
		System.out.println("���� : " + (ch+32) );
		
		
		// ĳ���� : �� ��ȯ (�ڷ��� ��ȯ)
		System.out.println("���� : " + (char)(ch+32) );
		System.out.println("���� : " + (double)(ch+32) );
		
		System.out.println( 1.111 );
		System.out.println( (int)1.111 );
		
		
		// ���ڿ�
		String n = "ȫ�浿";
		System.out.println(n + "�� �ȳ��ϼ���");
		n = "�谳��";
		System.out.println("�̸� ���� : " + n);
		
	}

}
