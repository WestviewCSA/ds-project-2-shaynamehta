
public class Tile {

	
		private int row, col;
		private char location;
		
		//main constructors
		public Tile(int row, int col, char location) {
			super();
			this.row = row;
			this.col = col;
			this.location = location;
		}
		
		//getters and setter
		public int getRow() {
			return row;
		}
		public void setRow(int row) {
			this.row = row;
		}
		public int getCol() {
			return col;
		}
		public void setCol(int col) {
			this.col = col;
		}
		public char getLocation() {
			return location;
		}
		public void setLocation(char location) {
			this.location = location;
		}
		
		

}
