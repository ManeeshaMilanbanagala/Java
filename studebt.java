
public class studebt extends school{
	
	int markst;
	int total;
	int avg;
	int sub1;
	int sub2;
	int sub3;
	
	public void setStudent(int a,int b,int c) {
		
		sub1 = a;
		sub2 = b;
		sub3 = c;
	}
	
	@Override
	public void cal() {
		total = sub1+sub2+sub3;
		avg = total/3;
	}
	
	@Override
	public void display() {
		System.out.println("Your average mark is :"+avg);
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		
	}

}
