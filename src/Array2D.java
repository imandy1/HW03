/**
 * Class for the creation of the linked list
 * 
 * @author Andy Xie
 *
 * @param <T>
 */
public class Array2D <T>{
	private int rows;
	private int cols;
	private Array2DNode<T> head;
	
	public Array2D(){
		head = new Array2DNode<T>();
		rows = 1;
		cols = 1;
	}
	public Array2D(int rows, int cols){
		this.rows = rows;
		this.cols = cols;
		head = new Array2DNode<T>();
		
		for(int i = 0; i < rows; i++){
			addFirstRow();
		}
	}
	//this constructor should take a generic 2d array
	public Array2D(int[][] a){
		
	}
	/**
	 * Displays all the data in the linked list. This method is used for
	 * debugging purposes
	 * 
	 */
	public void printList(){
		for(int i = 0; i < rows; i++){
			for(int k = 0; k < cols; k++){
				System.out.print("[" + get(i,k) + "]"  );
			}
			System.out.println();
		}
		
//		for(int i = 0; i < cols; i++){
//			System.out.print("[" + get(0,i
//					) + "]"  );
//		}
	}
	
	/**
	 * returns true if there are no nodes in the linked list
	 * @return
	 */
	public boolean isEmpty(){
		if(head == null){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * adds an empty column to the left of the linked list
	 */
	public void addFirstCol(){
		Array2DNode<T> newNode = new Array2DNode<>();
		
		if(isEmpty()){
			head = newNode;
		}
		else{
			if(rows == 1){
				newNode.right = head;
				head = newNode;
				cols++;
			}
			else if(rows > 1){
				
			}

		}
		
	}
	/**
	 * Adds an empty row to the top of the linked list
	 */
	public void addFirstRow(){
		Array2DNode<T> newNode = new Array2DNode<>();
		
		if(isEmpty()){
			head = newNode;
		}
		else{
			if(cols == 1){
				newNode.down = head;
				head = newNode;
				rows++;
			}
			else if(cols == 2){
				newNode.down = head;
				Array2DNode<T> tempNode = new Array2DNode<>();
				newNode.right = tempNode;
				tempNode.down = head.right;
				head = newNode;
				rows++;
			}
			else if(cols > 2){
				newNode.down = head;
				Array2DNode<T> tempNode = new Array2DNode<>();
				newNode.right = tempNode;
				tempNode.down = head.right;
				
				Array2DNode<T> tempNode2 = new Array2DNode<>();
				tempNode.right = tempNode2;
				tempNode2.down = head.right.right;
				
				
				
				rows++;
			}

		}
	}
	/**
	 * adds a empty column to the right of the linked list
	 */
	public void addLastCol(){
		
	}
	
	/**
	 * adds an empty row to the bottom of the linked list
	 */
	public void addLastRow(){
		
	}
	//for 5
	/**
	 * Adds a column to the index given at the parameter
	 * @param index
	 */
	public void addCol(int index){
		
	}
	//for 5
	/**
	 * Adds a row to the index given at the parameter
	 * @param index
	 */
	public void addRow(int index){
		
	}
	/**
	 * deletes the left most column of the linked list
	 */
	public void deleteFirstCol(){
		
	}
	/**
	 * delete the top most row of the linked list
	 */
	public void deleteFirstRow(){
		
	}
	
	/**
	 * deletes the right most column of the linked list
	 */
	public void deleteLastCol(){
		
	}
	/**
	 * deletes the bottom most row of the linked list
	 */
	public void deleteLastRow(){
		
	}
	//for 5
	/**
	 * deletes the column at the given index
	 * @param index
	 */
	public void deleteCol(int index){
		
	}
	//for 5
	/**
	 * deletes the row at the given index
	 * @param index
	 */
	public void deleteRow(int index){
		
	}
	
	/**
	 * returns the data from the node at the specified row and column
	 * @param row
	 * @param col
	 * @return
	 */
	public T get(int row, int col){
		Array2DNode<T> a = head;
		
		for(int i = 0; i < col; i++){
			a = a.right;
		}
		
		for(int i = 0; i < row; i++){
			a = a.down;
		}
		
		return a.getItem();
	}
	/**
	 * returns the node beginning at the requested column
	 * @param col
	 * @return
	 */
	public Array2DNode getCol(int col){
		Array2DNode<T> current = head;
		for(int i = 0; i < col; i++){
			current = current.right;
		}
		
		return current;
	}
	/**
	 * returns the node beginning at the requested row
	 * @param row
	 * @return
	 */
	public Array2DNode getRow(int row){
		Array2DNode<T> current = head;
		for(int i = 0; i < row; i++){
			current = current.down;
		}
		
		return current;
	}
	/**
	 * sets the node at given position to hold the given data
	 * @param row
	 * @param col
	 * @param item
	 */
	public void set(int row, int col, T item){
		Array2DNode<T> a = head;
		
		if(row == 0 && col == 0){
			a.setItem(item);
		}
		else{
			for(int i = 0; i < col; i++){
				a = a.right;
			}
			
			for(int i = 0; i < row; i++){
				a = a.down;
			}
			
			a.setItem(item);
		}

		
		
	}
	/**
	 * returns the column size of the linked list
	 * @return
	 */
	public int colSize(){
		return cols;
	}
	/** 
	 * returns the row size of the linked list
	 * 
	 * @return
	 */
	public int rowSize(){
		return rows;
	}


	
}
