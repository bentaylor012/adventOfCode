import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("input.txt");
		ArrayList<String> arr =  new ArrayList<String>();
		Scanner scn = null;
		try {
			scn = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//initialize
		while (scn.hasNextLine()) {
			arr.add(scn.nextLine());
		}
		int tree[] = {0,0,0,0,0};
		int col=0;
		int len =  arr.get(0).length();
		for (int i =0; i< arr.size(); i++) {
			//System.out.println(col%len+"="+arr.get(i).charAt(col%len));
			if (arr.get(i).charAt(col%len) == '#')
				tree[0]++;
			col+=3;
		}
		col = 0;
		for (int i =0; i< arr.size(); i++) {
			//System.out.println(col%len+"="+arr.get(i).charAt(col%len));
			if (arr.get(i).charAt(col%len) == '#')
				tree[1]++;
			col+=1;
		}
		col = 0;
		for (int i =0; i< arr.size(); i++) {
			//System.out.println(col%len+"="+arr.get(i).charAt(col%len));
			if (arr.get(i).charAt(col%len) == '#')
				tree[2]++;
			col+=5;
		}
		col = 0;
		for (int i =0; i< arr.size(); i++) {
			//System.out.println(col%len+"="+arr.get(i).charAt(col%len));
			if (arr.get(i).charAt(col%len) == '#')
				tree[3]++;
			col+=7;
		}
		col = 0;
		for (int i =0; i< arr.size(); i+=2) {
			//System.out.println(col%len+"="+arr.get(i).charAt(col%len));
			if (arr.get(i).charAt(col%len) == '#')
				tree[4]++;
			col+=1;
		}
		long totalTree = 1;
		for (int i = 0; i< 5; i++)
			totalTree*=tree[i];
		System.out.println(totalTree);
		
	}

}
