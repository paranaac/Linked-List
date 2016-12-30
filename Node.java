
/**
 * @author Alejandro
 * @date 11/02/2014
 * Purpose: Node class
 */

// <T> is a placeholder for the type we're going to specify when we create the node
public class Node<T> {
	private Node<T> next;
	private T data;

	/************************************
	 * Creates an empty node
	 *************************************/
	public Node() {
		next = null;
		data = null;
	}

	/************************************
	 * Creates an node with specified data
	 *************************************/
	public Node(T data) {
		next = null;
		this.data = data;
	}

	/************************************
	 * Return the next node in our list
	 *************************************/
	public Node<T> getNext() {
		return next;
	}

	/************************************
	 * Set the node that follows this node
	 *************************************/
	public void setNext(Node<T> node) {
		next = node;
	}

	/************************************
	 * Return the value stored in the node
	 *************************************/
	public T getData() {
		return data;
	}

	/************************************
	 * Set the element stored in this node
	 *************************************/
	public void setData(T data) {
		this.data = data;
	}
}