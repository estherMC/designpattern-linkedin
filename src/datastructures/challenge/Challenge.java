package datastructures.challenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> groceries = new ArrayList (Arrays.asList ("pa", "xocolata", "ous", "aigua", "fruita"));
		
		ArrayList<String> second = new ArrayList (Arrays.asList("llegums", "iogurt", "peix", "carn"));
		
		groceries.addAll(second);
		
		
		
		for (int i= 0; i<groceries.size(); i++){
			if (groceries.get(i).contains("iogurt")){
				System.out.println("He trobat el iogurt a la posició " + i);
				groceries.remove("iogurt");
			}
		}
		//Otra manera con lambda
		groceries.stream().
		filter(aliment -> aliment.equalsIgnoreCase("iogurt")).
		findFirst().
		ifPresent(System.out::println);
		
	}

}
