
public class Array2D <T>{
	private int rows;
	private int cols;
	private Array2DNode head;
	
	public Array2D(){
		
	}
	public Array2D(int rows, int cols){
		this.rows = rows;
		this.cols = cols;
	}
	//this constructor should take a generic 2d array
	public Array2D(int[][] a){
		
	}
	
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		else{
			return false;
		}
	}
	public void addFirstCol(){
		Array2DNode newNode = new Array2DNode();
		
		if(isEmpty()){
			head = newNode;
		}
		else{
			newNode.right = head;
			head = newNode;
		}
		
	}
	public void addFirstRow(){
		Array2DNode newNode = new Array2DNode();
		
		if(isEmpty()){
			head = newNode;
		}
		else{
			newNode.down = head;
			head = newNode;
		}
	}
	public void addLastCol(){
		
	}
	public void addLastRow(){
		
	}
	//for 5
	public void addCol(int index){
		
	}
	//for 5
	public void addRow(int index){
		
	}
	public void deleteFirstCol(){
		
	}
	public void deleteFirstRow(){
		
	}
	public void deleteLastCol(){
		
	}
	public void deleteLastRow(){
		
	}
	//for 5
	public void deleteCol(){
		
	}
	//for 5
	public void deleteRow(){
		
	}
//	public T get(int row, int col){
//		
//	}
//	public T getCol(int col){
//		
//	}
//	public T getRow(int row){
//		
//	}
	public int colSize(){
		return cols;
	}
	public int rowSize(){
		return rows;
	}


	
}
