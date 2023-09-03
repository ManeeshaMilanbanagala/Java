
public class teacher extends school {
	
	int bsalarys;
	double total;
	
	public void setTeacher(int b) {
		bsalarys = b;
		
	}
	
	@Override
	public void salary() {
	total = bsalarys*1000;
	}
	
	@Override
	public void display() {
		System.out.println("Your salary is :"+ total);
	}

	@Override
	public void cal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		
	}

}
