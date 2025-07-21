package LinkedList;

import java.util.LinkedList;

public class LinkedListOperation {
    /**
     * This class demonstrates basic operations on a linked list.
     * It includes methods to add, remove, and display elements in the linked list.
     * Linked lists are data structures that consist of nodes, where each node contains data and a reference to the next node.
     * Linked lists are useful for dynamic memory allocation and efficient insertions and deletions.
     * The main method creates a linked list, adds elements to it, removes an element, and displays the linked list before and after the removal.
     * Linked lists can be singly linked or doubly linked, depending on whether each node points to the next node only or both the next and previous nodes.
     */
    public static void main(String[] args) {
        // Create a linked list and perform operations
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Node 1");
        linkedList.add("Node 2");
        linkedList.add("Node 3");

        // Display the linked list
        System.out.println("Linked List: " + linkedList);

        // Remove an element from the linked list
        linkedList.remove("Node 2");

        // Display the linked list after removal
        System.out.println("Linked List after removal: " + linkedList);

        // Add more elements to the linked list
        linkedList.add("Node 4");
        linkedList.add("Node 5");
        // Display the linked list after adding more elements
        System.out.println("Linked List after adding more elements: " + linkedList);
    }
}
