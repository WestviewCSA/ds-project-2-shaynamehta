import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p2");
		readMap("TEST01");
		
		
	}
	
	public static void readMap(String filename) {
		
		try {
			File test = new File(filename);
			Scanner scan = new Scanner(test);
			
			//insert code and commands here
			//need to read characters, determine what they are
			//map format and coordinate format
			
			//get specs/parameters for 
			int numRows 		= scan.nextInt();
			int numCols 		= scan.nextInt();
			int numRooms 		= scan.nextInt();
			
			int rowIndex = 0;
			
			//process the rest of the map
			while (scan.hasNextLine()) {
				
				//grab one row at a time
				String row = scan.nextLine();
				
				if (row.length() > 0) {
					for (int i = 0 ; i < numCols && i < row.length() ; i++) {
						
						char el = row.charAt(i);
						Tile obj = new Tile(rowIndex, i, el);
						
					}
					
				}
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("error"); //change this to the right error
		}
		
		
	}
	
	
}
