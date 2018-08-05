package com.cg.lambdaexpressions;

import java.io.File;
import java.util.Scanner;

public class ListExtension {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the directory name along with the path");
		
		//Take the path as user input
		String path=scanner.nextLine();
		File dir=new File(path);
		
		//Take the file extension as user input
		System.out.println("Enter the extension");
		String ext=scanner.nextLine();

		//Filtering out the files with that extension from the list
		String[] listFile=dir.list((d,s) -> s.toLowerCase().endsWith(ext)); 

		//Displays the files with that extension
		for(String file:listFile) {
			System.out.println(file);
		}

	}

	
	
}
