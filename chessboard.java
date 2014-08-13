class chessboard {
  	public static void main(String[] arguments){
		
		for (int i = 0; i < 8; i++) {
			for (int j =0; j < 8; j++) {
				if((j % 2) == 0) {
					System.out.print("# ");
				} else {
					System.out.print("_ ");
				}
			}
			System.out.println();
 		}
	}
}

