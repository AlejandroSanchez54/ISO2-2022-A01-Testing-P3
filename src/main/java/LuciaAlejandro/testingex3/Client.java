package LuciaAlejandro.testingex3;

public class Client {
	private int age;
	private boolean studies;
	private boolean parentsHouse;
	private boolean university;
	private boolean work;
	
	public Client(int age, boolean studies, boolean parentsHouse, boolean university, boolean work) {
		super();
		this.age = age;
		this.studies = studies;
		this.parentsHouse = parentsHouse;
		this.university = university;
		this.work = work;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean getStudies() {
		return studies;
	}

	public void setStudies(boolean studies) {
		this.studies = studies;
	}

	public boolean getParentsHouse() {
		return parentsHouse;
	}

	public void setParentsHouse(boolean parentsHouse) {
		this.parentsHouse = parentsHouse;
	}

	public boolean getUniversity() {
		return university;
	}

	public void setUniversity(boolean university) {
		this.university = university;
	}

	public boolean getWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

}
