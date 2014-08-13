class Marathon {
	public static void main(String[] arguments) {
		String[] names = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
            "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
            "Aaron", "Kate"
        };
        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265 
        };
        winner(times, names);
	}
	public static void winner(int[] times, String[] names) {
    	int lowest = times[0];
    	String lowestName = names[0];
    	for (int i=0; i<names.length;i++){
    		if (times[i]<lowest){
				lowestName = names [i];
    			lowest = times[i];
    		}
    	}
    	System.out.println(lowestName + lowest);
    }
}