
public class Main {
	public static void main(String[] args){
		Array2D<String> data = new Array2D<>();
		data.addFirstCol();
		data.addFirstCol();
		data.addFirstCol();

		
		data.set(0, 0, "a"); //head
		data.set(0, 1, "b");
		data.set(0, 2, "c");
		data.set(0, 3, "d");

		System.out.println(data.getCol(2).getItem());
		
		data.printList();
		data.colSize();
	
		
	}
}
