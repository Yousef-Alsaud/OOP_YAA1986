package org.howard.edu.lsp.hw2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCounting {

	public static void main(String[] args) throws IOException {
		
		// Name: Yousef Alsaud
		
		//Input and Scanner
		FileInputStream fin = new FileInputStream("src/main/resources/words.txt");
		Scanner fileInput = new Scanner(fin);
		
		// ArrayList
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		//Read and Find
		while(fileInput.hasNext()){
			
			String nextWord = fileInput.next();
			
			if(words.contains(nextWord)) {
				int index = words.indexOf(nextWord);
				count.set(index, count.get(index) + 1);
			}
			else {
				words.add(nextWord);
				count.add(1);
			}
			
		}
		//End and Print
		fileInput.close();
		fin.close();
		
		for(int i = 0; i < words.size(); i++ ) {
			System.out.println(words.get(i) + "\t" + "\t" +  count.get(i));
		}
 	}

}
