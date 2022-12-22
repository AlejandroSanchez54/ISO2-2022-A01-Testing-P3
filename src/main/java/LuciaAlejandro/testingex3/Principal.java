package LuciaAlejandro.testingex3;

public class Principal {
	public Account determineAccount(Client c) {
		
		if(c.getAge()<18 && c.getStudies() && c.getParentsHouse()) {
			Account account = new Account("Comfort");
			return account;
		}
		if(c.getAge()<25 && c.getUniversity()==false && c.getParentsHouse()) {
			Account account = new Account("Come on, you can");
			return account;
		}
		if(c.getAge()>18 && c.getAge()<25 && c.getWork()) {
			if(c.getParentsHouse()) {
				Account account = new Account("Save Now While You Can");
				return account;
			}
			else {
				Account account = new Account("Jump out of the Nest");
				return account;
			}	
		}
		if(c.getAge()>25 && c.getWork()== true && c.getParentsHouse()==true) {
			Account account = new Account("Become independent, it's about time");
			return account;
		}
		if(c.getAge()>25 && c.getWork() && c.getParentsHouse()==false) {
			Account account = new Account("Welcome to Adult Life");
			return account;
		}
		
		return null;	
	}
}
