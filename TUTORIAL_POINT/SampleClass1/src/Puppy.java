
public class Puppy {
	
	int puppyAge;
	
	public Puppy(String name) {
		// This constructor has one parameter, name
		System.out.println("Passed name is :"+name);
	}
	
	public void setAge(int age) {
		puppyAge=age;
	}
	
	public int getAge() {
		System.out.println("Puppy's age is : "+puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		//Following statement would create an object myPuppy
		Puppy myPuppy=new Puppy("Tommy");
		
		// Call class method to set puppy's age
		myPuppy.setAge(2);
		
		// Call Another class method to get puppy's age
		myPuppy.getAge();
		
		// You can access instance variable as follows as well
		System.out.println("Variable vale : "+myPuppy.puppyAge);
	}
}
