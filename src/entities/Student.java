package entities;

public class Student {
	public String name;
	public double value1, value2, value3;
	public double finalGrade;
	public String situation;
	public double missingPoints;

	public Student(String name, double value1, double value2, double value3) {
		this.name = name;

		if (value1 <= 30 && value1 >= 0) {
			this.value1 = value1;
		} else {
			this.value1 = 30;
		}

		if (value2 <= 35 && value2 >= 0) {
			this.value2 = value2;
		} else {
			this.value2 = 35;
		}

		if (value3 <= 35 && value3 >= 0) {
			this.value3 = value3;
		} else {
			this.value3 = 35;
		}

	}

	public double getFinalGrade() {
		return finalGrade = value1 + value2 + value3;
	}

	public void approved() {
		if (finalGrade >= 60) {
			situation = "PASS";
		} else if (finalGrade < 60){
			situation = "FAILED";
		}
	}

	public String getSituation() {
		return situation;
	}

	public double getMissingPoints() {
		if (finalGrade < 60) {
			missingPoints = 60 - finalGrade;
		} else {
			missingPoints = 0;
		}
		return missingPoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue1() {
		return value1;
	}

	public void setValue1(double value1) {
		this.value1 = value1;
	}

	public double getValue2() {
		return value2;
	}

	public void setValue2(double value2) {
		this.value2 = value2;
	}

	public double getValue3() {
		return value3;
	}

	public void setValue3(double value3) {
		this.value3 = value3;
	}
}
