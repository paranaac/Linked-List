/**
 * @author Alejandro
 * @date 11/02/2014 Purpose: Driver for Linked List
 */

public class LinkedListDriver {
	public static void main(String[] args) {

		LinkedList<String> states = new LinkedList<String>();

		states.addToEnd("NY");
		states.addToEnd("FL");
		states.addToEnd("AL");
		System.out.println(states);

		states.addToFront("AK");
		states.addToFront("SC");
		states.addToFront("HI");
		System.out.println(states);

		states.replace("OH", 3);
		System.out.println(states);

		states.deleteFromEnd();
		states.deleteFromFront();
		System.out.println(states);

		states.findInList("SC");
		System.out.println();
		
		states.findInList("NC");
		System.out.println();

		System.out.println("Index 1: " + states.get(1));
		System.out.println();

		states.deleteFromEnd();
		states.deleteFromEnd();
		states.deleteFromEnd();

		System.out.println(states);
	}
}
