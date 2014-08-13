public class Runner {

	// fields
	String name;
	double time;

	// constructor
	public Runner(String myName, double myTime) {
		name = myName;
		time = myTime;
	}

	// methods

	public double getTime(){
		return time;
	}
	
	public String getName(){
	return name;
	}
}