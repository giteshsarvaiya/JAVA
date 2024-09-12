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
        if(size == 0){
            tail = node;
        }
        size++;

    }

    public void insertLast(int value){
        if(size == 0) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
        node.next = null;
        node.prev = temp;

        tail = node;

        this.size++;

    }

    public void insertAtIndex(int value, int index){
        if(index == 0 ){
            insertFirst(value);
            return;
        }
        if(index == size) {
            insertLast(value);
            return;
        }

        Node node = new Node(value);
        Node temp = head;
        for (int count = 0; count < index - 1 ; count ++){
            temp = temp.next;
        }

        node.next = temp.next;
        node.next.prev = node;
        temp.next = node;
        node.prev = temp;
        this.size++;

    }


    public void displayAll(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayAllRev(){
        Node temp = tail;

        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }
        System.out.println("START");
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
