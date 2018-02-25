public class integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int girls, boys, people, loners;
		girls = 11;
		boys = 3;
		people = girls / boys;
		loners = girls % boys; 
		System.out.println("There are " + people + " pairs.");
		System.out.println(loners + " people have no partner.");
	}

}
