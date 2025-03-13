import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p2");
		readMap("TEST04");
		
		
	}
	
	
	//how to deal with multiple rooms? reset row index
	public static void readMap(String filename) { 	//this reads all the rooms but
													//there is nothing that indicates when a new
													//room is entered; there are just a lot of 
													//tiles created
		
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
				
				//while row < num rows traverse and then once it is done, add room if 
				//multiple; use another while loop to update room number
				
				for (int roomNum = 0 ; roomNum < numRooms ; roomNum++ ) {
				
					if (row.length() > 0) {
						for (int i = 0 ; i < numCols && i < row.length() ; i++) {
						
							char el = row.charAt(i);
							//creates a Tile for each space in map
							Tile obj = new Tile(rowIndex, i, roomNum, el); 
							System.out.println(obj.toString()); 
						}
					
					}
				
				rowIndex++;
				
				}
				rowIndex = 0;
			}	
			
			
		} catch (FileNotFoundException e) {
			System.out.println("error"); //change this to the right error
		}
		
		
		
	}
	
	//reading the coordinate form map
	public static void readCoordMap(String filename) {
		
		try {
			File test = new File(filename);
			Scanner scan = new Scanner(test);
			
			
			//first obtain specs in the first line
			int numRows 	= scan.nextInt();
			int numCols 	= scan.nextInt();
			int numRooms 	= scan.nextInt();
			
			//now process the rest of the map
			//store in a tile but instead of typical traversal
			//will use the data given to properly place it
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	
}
