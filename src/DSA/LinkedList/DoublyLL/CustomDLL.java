package DSA.LinkedList.DoublyLL;
// Custom Implementation of Doubly Linked List


public class CustomDLL {

    private Node head;
    private Node tail;
    private int size;

    CustomDLL(){
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public void insertFirst(int value){
        Node node = new Node(value);


        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void displayAll(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node {
        int value;
        Node next;
        Node prev;

        Node (int value){
            this.value = value;
        }

        Node (int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

    }
}
