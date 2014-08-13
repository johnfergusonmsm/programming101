class loops {
  	public static void main(String[] arguments){
//		System.out.println("Rule #1");
//		System.out.println("Rule #2");
//		System.out.println("Rule #3");

  		int i = 1;
		while (i <= 10) {

			System.out.println("MSM Employee" + i);
			i = i+1;
		}
			
		for (int j = 0; j<=10; j++) {
			if (j == 6){
//				break;
				continue;		//branching statements "break" & "continue"
			}
			System.out.println("TSM Employee" + j);
		}
 	}
}



