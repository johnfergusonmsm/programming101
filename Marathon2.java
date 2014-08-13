public class Marathon2 {
	public static void main (String[] args){
		System.out.println("I'm running a marathon");

		Runner[] runners = new Runner[5];
		runners[0] = new Runner("James",2.34);
		runners[1] = new Runner("Paul",5.30);
		runners[2] = new Runner("Lucy",1.24);
		runners[3] = new Runner("John",1.98);
		runners[4] = new Runner("Sarah",3.01);

		Runner fastestRunner = runners[0];
		Runner runnerUp = runners[0];

		for (int i=1; i<runners.length; i++) {

			Runner runner = runners [i];

			// I want to compare fastestRunner with runner
			if(runner.getTime() < fastestRunner.getTime()) {
				fastestRunner = runner;
			}

			if(runner.getTime() > fastestRunner.getTime()) {

				if (runner.getTime() < runnerUp.getTime()){
					runnerUp=runner;
				}
			}
		}

		System.out.println("Fastest person is " + fastestRunner.getName() + " with a time of " + fastestRunner.getTime() + " hrs.");
		System.out.println("Runner Up " + runnerUp.getName() + " with a time of " + runnerUp.getTime() + " hrs.");

	}
}