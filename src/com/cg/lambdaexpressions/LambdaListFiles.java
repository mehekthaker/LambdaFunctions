package com.cg.lambdaexpressions;

import java.io.File;
import java.util.Scanner;

public class LambdaListFiles {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the directory name along with the path");
		String path = scanner.nextLine();
		
		//Take the path as user input
		File dir = new File(path);

		//Using lambda expression to check whether the given path contains any sub-directory in it
		File[] subDirs = dir.listFiles((file) -> file.isDirectory());
		System.out.println("List of subdirectories in the given directory is");
		for (File file : subDirs) {
			System.out.println(file.getName());
		}

		System.out.println("*******************************");

		//Using Method References to check whether the given path contains any sub-directory in it
		File[] subDirsMR = dir.listFiles(File::isDirectory);
		System.out.println("List of subdirectories in the given directory (using method references) is ");
		for (File file : subDirsMR) {
			System.out.println(file.getName());
		}
	}

}
