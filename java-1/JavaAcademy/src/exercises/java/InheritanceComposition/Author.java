package exercises.java.InheritanceComposition;

public class Author {
	//variables
	private String name;
	private String email;
	private char gender;
	
	//constructor
	public Author(String name, String email, char gender) {
	      this.setName(name);
	      this.setEmail(email);
	      this.setGender(gender);
	   }
	//getter && setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//puts author data in a string
	public String toString(){
		String data = name+" "+email+" "+gender;
		return data;
	}
}
