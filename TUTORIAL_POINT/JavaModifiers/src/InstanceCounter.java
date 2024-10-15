
public class InstanceCounter {
	
	// static variable
	private static int numInstance =0;
	
	// static methods
	protected static int getCount() {
		return numInstance;
	}
	
	private static void addInstance() {
		numInstance++;
	}
	
	//constructor
	InstanceCounter(){
		InstanceCounter.addInstance();
	}

	public static void main(String[] args) {
		System.out.println("Starting with "+InstanceCounter.getCount()+" instances ");
		for(int i=0;i<500;i++) {
			new InstanceCounter();
		}
		System.out.println("created "+InstanceCounter.getCount()+" instances");
	}
}
