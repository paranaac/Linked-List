/**
 * @author Alejandro
 * @date 11/02/2014 Purpose: Implement a Linked List ADT
 */

public class LinkedList<T> {
	// Reference to the first node on the list
	private Node<T> list;
	private int count;

	/************************************
	 * Create an empty list
	 *************************************/
	public LinkedList() {
		count = 0;
		list = null;
	}

	/************************************
	 * Add a specified element to the front of the list
	 *************************************/
	public void addToFront(T data) {
		Node<T> node = new Node<T>(data);
		node.setNext(list);
		list = node;
		count++;
	}

	/************************************
	 * Add a specified element to the end of the list
	 *************************************/
	public void addToEnd(T data) {
		Node<T> node = new Node<T>(data);
		Node<T> current;

		// Is it the first one on the list?
		if (list == null) {
			list = node;
		} else {
			// Find the node with the next null pointer
			current = list;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			// Add our new node to the end of the list
			current.setNext(node);
		}
		count++;
	}

	/************************************
	 * Find a specified element in the list
	 *************************************/
	public void findInList(T data) {
		Node<T> current = list;
		int pos = 0;

		while (current != null) {
			if (current.getData() == data) {
				System.out.println(data + " found at position " + pos + ".");
				return;
			} else {
				pos++;
				current = current.getNext();
			}
		}
		System.out.println(data + " not found in the list.");
	}

	/************************************
	 * Delete node from the front of the list
	 *************************************/
	public void deleteFromFront() {
		if (isEmpty())
			return;
		else {
			list = list.getNext();
			count--;
		}
	}

	/************************************
	 * Delete node form the end of the list
	 *************************************/
	public void deleteFromEnd() {
		if (isEmpty())
			return;
		else {
			if (list.getNext() == null) {
				list = null;
			} else {
				Node<T> temp = list;
				Node<T> prev = list;
				while (temp.getNext() != null) {
					prev = temp;
					temp = temp.getNext();
				}
				prev.setNext(null);
			}
		}
		count--;
	}

	/************************************
	 * Replace element at certain index
	 *************************************/
	public void replace(T data, int index) {
		Node<T> current = list;
		if (index > count) {
			throw new IllegalArgumentException("Bad Index");
		}
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		current.setData(data);
	}

	/************************************
	 * Get node element at a certain index
	 *************************************/
	public T get(int index) {
		if (index < 0 || index >= count) {
			throw new IndexOutOfBoundsException("Bad Index");
		}
		Node<T> current = list;
		for (int i = 0; i < index; i++) {
			current = current.getNext();
		}
		return current.getData();
	}

	/************************************
	 * Return true if the list is empty
	 *************************************/
	public boolean isEmpty() {
		return (count == 0);
	}

	/************************************
	 * Return the current size of our list
	 *************************************/
	public int size() {
		return count;
	}

	/************************************
	 * Return the string representation of the list
	 *************************************/
	@Override
	public String toString() {
		StringBuilder strB = new StringBuilder();
		Node<T> current = list;
		strB.append("Size: ").append(count).append("\n");
		while (current != null) {
			strB.append("[").append(current.getData()).append("]\n");
			current = current.getNext();
		}
		return strB.toString();
	}
}