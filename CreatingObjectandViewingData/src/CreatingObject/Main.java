package CreatingObject;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		s1.setId(3423);
		s1.setName("Karla");
		s1.setGpa(4324.00);
		
		System.out.println("id: "+s1.getId()+" name: "+ s1.getName()+" gpa: "+ s1.getGpa());
	}

}
