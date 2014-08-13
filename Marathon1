class Marathon1 {

    public static int fastestRunner(String[] names, int[] times) {
        int lowestTime = times[0];
        int lowestTimeIndex = 0;
        for (int i = 0; i < names.length; i++) {
            if (times[i] < lowestTime) {
                lowestTime = times[i];
                lowestTimeIndex = i;
            }
        }
        return lowestTimeIndex;
    }

    public static int secondFastestRunner(String[] names, int[] times, int lowestTimeIndex) {
        int secondLowestTime = times[0];
        int secondLowestTimeIndex = 0;
        for (int i = 0; i < names.length; i++) {
            if (i == lowestTimeIndex) {
                continue;
            }
            if (times[i] < secondLowestTime) {
                secondLowestTime = times[i];
                secondLowestTimeIndex = i;
            }
        }
        return secondLowestTimeIndex;
    }

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
        int lowestTimeIndex = fastestRunner(names, times);
        System.out.println("Fastest runner is " + names[lowestTimeIndex] + " with a time of " + times[lowestTimeIndex] + " minutes");

        int secondLowestTimeIndex = secondFastestRunner(names, times, lowestTimeIndex);
        System.out.println("Second fastest runner is " + names[secondLowestTimeIndex] + " with a time of " + times[secondLowestTimeIndex] + " minutes");
    }
}