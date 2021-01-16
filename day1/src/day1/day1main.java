package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day1main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean found = false;
		File file = new File("input.txt");
		Scanner scn = null;
		ArrayList<Integer> input = new ArrayList<Integer>();
		try {
			scn = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//setup
		while (scn.hasNextLine()) {
			input.add(Integer.parseInt(scn.nextLine()));
		}
		
		//part 1
		for (int i = 0; i<input.size()-1; i++) {
			for (int j = i+1; j<input.size(); j++) {
				if (input.get(i) + input.get(j) == 2020) {
					System.out.println(input.get(i)*input.get(j));
					found = true;
					break;
				}
			}
			if (found)
				break;
		}
		found = false;
		//part 2
		for (int i = 0; i<input.size()-2; i++) {
			for (int j = i+1; j<input.size()-1; j++) {
				for (int k = j +1; k<input.size(); k++) {
					if (input.get(i) + input.get(j)+ input.get(k) == 2020) {
						System.out.println(input.get(i)*input.get(j)*input.get(k));
						found = true;
						break;
					}
				}
				if (found)
					break;
			}
			if (found)
				break;
		}
	}

}
