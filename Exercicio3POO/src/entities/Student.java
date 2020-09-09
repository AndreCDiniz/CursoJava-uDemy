package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	
	public double avarage() {
		return grade1 + grade2 + grade3;
	}
	
	public double missingPoints() {
		if (avarage() < 60.0) {
			return 60.0 - avarage();
		}
		else {
			return 0.0;
		}
		
	}


}
