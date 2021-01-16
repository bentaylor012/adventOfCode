package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("input.txt");
		Scanner scn = null;
		try {
			scn = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int total = 0;
		int total2 = 0;
		//setup
		while (scn.hasNextLine()) {
			String line = scn.nextLine();
			String splt[] = line.split(" ");
			String upperLower[] = splt[0].split("-");
			int times = 0;
			for (int i=0; i < splt[2].length();i++) {
				if (splt[2].charAt(i) == splt[1].charAt(0))
					times++;
			}
			
			if (times <= Integer.parseInt(upperLower[1])&&
					times >= Integer.parseInt(upperLower[0]))
				total++;
			
			if (splt[2].charAt(Integer.parseInt(upperLower[0])-1) == splt[1].charAt(0)^
					splt[2].charAt(Integer.parseInt(upperLower[1])-1) == splt[1].charAt(0))
				total2++;
		}
		
		System.out.println(total);
		System.out.println(total2);
	}
	
	

}
