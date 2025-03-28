import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Map {

    private Tile[][][] mainMap;

    public static void main(String[] args) {
        Map map = new Map();
        map.readMap("TEST01");
    }

    // Map constructor
    public Map() {
    }

    // Read the map file
    public void readMap(String filename) {
        try {
            File file = new File(filename);
            Scanner scan = new Scanner(file);

            // Read map dimensions
            int numRows = scan.nextInt();
            int numCols = scan.nextInt();
            int numRooms = scan.nextInt();
            scan.nextLine();  // Move to the next line after dimensions

            // Initialize the map
            mainMap = new Tile[numRooms][numRows][numCols];

            // Read and populate each room
            for (int roomNum = 0; roomNum < numRooms; roomNum++) {
                for (int rowIndex = 0; rowIndex < numRows; rowIndex++) {
                    if (!scan.hasNextLine()) {
                        System.out.println("Unexpected end of file.");
                        return;
                    }
                    
                    String row = scan.nextLine();
                    
                    for (int colIndex = 0; colIndex < numCols && colIndex < row.length(); colIndex++) {
                        char el = row.charAt(colIndex);
                        mainMap[roomNum][rowIndex][colIndex] = new Tile(rowIndex, colIndex, roomNum, el);
                    }
                }
            }

            scan.close();
            System.out.println("Map loaded successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    //use this for debugging
    public void printMap() {
        if (mainMap == null) {
            System.out.println("Map not initialized.");
            return;
        }

        for (int room = 0; room < mainMap.length; room++) {
            System.out.println("Room " + (room + 1) + ":");
            
            for (int row = 0; row < mainMap[room].length; row++) {
                for (int col = 0; col < mainMap[room][row].length; col++) {
                    Tile tile = mainMap[room][row][col];
                    System.out.print(tile.getValue() + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
