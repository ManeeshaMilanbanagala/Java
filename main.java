import java.util.Scanner;
public class main {

	public static void main(String []args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("1.Are you teacher");
		System.out.println("2.Are you Student");
		
		System.out.println("Enter your status");
		int number = scn.nextInt();
		
		int markst;
		int total;
		int avg;
		int sub1;
		int sub2;
		int sub3;
		int bsalarys;
		

		teacher t = new teacher();
		studebt s = new studebt();
		if(number == 1) {
			System.out.println("Enter your basic salary");
			 bsalarys = scn.nextInt();
			 
			t.setTeacher(bsalarys);
			t.salary();
			t.display();
			
			

		}
		else if(number == 2) {
			System.out.println("Enyer your 1 subject marks");
			 sub1 = scn.nextInt();
			
			System.out.println("Enyer your 2 subject marks");
			 sub2= scn.nextInt();

			System.out.println("Enyer your 3 subject marks");
			 sub3 = scn.nextInt();
			
			s.setStudent(sub1, sub3, sub3);
			s.cal();
			s.display();
		}

	}
	
}
