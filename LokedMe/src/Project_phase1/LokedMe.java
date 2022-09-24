package Project_phase1;

	import java.io.File;
	//import java.io.*;
	import java.io.FilenameFilter;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Scanner;

	public class LokedMe {	
		static final String FilesPath = "C:\\Users\\Ronak Gupta\\eclipse-workspace\\Java Phase 1\\src\\Project_phase1";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("\n**** Welcome to My Project ****\n");
			System.out.println("Developer Details\n-----------------");
			System.out.println("Name:-Ronak Gupta");
			System.out.println("Project name: Virtual Key For Repository");
			System.out.println("Email id: ronakgupta925@gmail.com\n...................................\n");

			Scanner sc = new Scanner(System.in);
			SortFiles();
			int option;
			do {
				 System.out.println("\n1. Create New File\n2. Delete Existing File \n3. Search for a File \n4. Navigate to Main Content \n5. Exit Program");
				 System.out.println("Enter your option");
				option = sc.nextInt();
				switch(option) {
				case 1: 
					CreateNewFile();
					break;
				case 2:
					DeleteFile();
					break;
				case 3:
		      		SearchingFile();
		      		break;
				case 4:
					SortFiles();
					break;
				case 5:
					System.exit(0);
				default:System.out.println("Invalid option");
				}
			}while(option>0);
		}
		
		private static void CreateNewFile() {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your File Name :");
			String file = sc.next();
			file = file+".txt";
			File f = new File(FilesPath+"//"+file);
			try {
				try {
					if(f.exists()) {
						System.out.println("File Already Exists");
					}else {
						f.createNewFile();
						System.out.println(file+" Created");
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public static void DeleteFile() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the file to be deleted :");
			String file = sc.next();
			file = file + ".txt";
			File f = new File(FilesPath+"//"+file);
			try {
				if(f.exists()) {
					f.delete();
					System.out.println(file+" Deleted.");
				}else {
					System.out.println(file+" not Found");
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		
		public static void SortFiles() {
			File fileDir = new File(FilesPath);
			if(fileDir.isDirectory()){
				List<String> listFile = Arrays.asList(fileDir.list());
				Collections.sort(listFile);
				System.out.println("Sorting by Files in ascending order:\n");
				for(String s:listFile){
					System.out.println(s);
				}
			}
			else{
				System.out.println(fileDir.getAbsolutePath() + " is not a directory");
			}
		}
		
		public static void SearchingFile() {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the file to Search: ");
			String file = s.next();
			file = file + ".txt";
			File directory = new File(FilesPath);
			FilesFilter filter = new FilesFilter(file);
			String[] files = directory.list(filter);
			
			if (files.length == 0) {
				System.out.println("File not Found.\n");
			}
			else {
				for (int i = 0; i < files.length; i++) {
					System.out.println(files[i]+" found\n");
				}
			}
		}

	}

	class FilesFilter implements FilenameFilter {
		
		String files;
		public FilesFilter(String files)
		{
			this.files = files;
		}
		public boolean accept(File dir, String name)
		{
			return name.equals(files);
		}
	}




