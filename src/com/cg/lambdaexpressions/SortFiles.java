package com.cg.lambdaexpressions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class SortFiles {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);

		ArrayList<File> files=new ArrayList<>();
		
		//Takes the path as user input
		System.out.println("Enter directory name along with the path");
		String path=scanner.nextLine();
		
		File dir=new File(path);

		//Stores the list of files
		File[] file=dir.listFiles();

		files.addAll(Arrays.asList(file));
		//Checks the file whether it is directory or not
		Predicate<File> findDirectories = (fileInList) -> fileInList.isDirectory();

		//Sorts the directories according to their paths
		files.stream().filter(findDirectories).sorted().forEach(System.out::println);
		
		//Sorts the files which are not directories according to their paths
		files.stream().filter(findDirectories.negate()).sorted().forEach(System.out::println);
		scanner.close();
	}

	
}
