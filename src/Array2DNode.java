/**Class to create nodes for the linked list.
 * 
 * @author Andy Xie
 *
 * @param <T>
 */
public class Array2DNode <T>{
	private T item;
	protected Array2DNode<T> down;
	protected Array2DNode<T> right;
	
	
	public Array2DNode(){
		
	}
	public Array2DNode(T item){
		this.item = item;
	}
	/**
	 * returns the data stored in the node
	 * @return
	 */
	public T getItem(){
		return item;
	}
	
	/**
	 * sets the data in the node to the item in the parameter
	 * @param item
	 */
	public void setItem(T item){
		this.item = item;
	}
}
