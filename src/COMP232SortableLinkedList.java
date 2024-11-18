/**
 * A sortable DoublyLinkedList.  The fields and the DLLNode class in the
 * COMP232DoublyLinkedList class are protected fields and can be accessed
 * directly in this class.
 * 
 * @author William Goble
 * @author Dickinson College
 * 
 */
public class COMP232SortableLinkedList<E extends Comparable<E>> extends COMP232DoublyLinkedList<E> {

	/**
	 * Implementation of insertion sort for the LinkedList. The elements of the
	 * list will be sorted according to the order imposed by their compareTo
	 * method.
	 */
	public void insertionSortList() {
		// Intentionally not implemented - see homework assignment.
		for (int i = 1; i < size; i++) {
			E current = get(i);
			int j = i;
	
			while (j > 0 && get(j - 1).compareTo(current) > 0) {
				set(j, get(j - 1));
				j--;
			}
	
			set(j, current);
		}
	}
	




	public static void main(String[] args) {
		COMP232SortableLinkedList<Integer> list = new COMP232SortableLinkedList<Integer>();
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(1);
		
		list.insertionSortList();
		System.out.println(list.toString());
}

}
