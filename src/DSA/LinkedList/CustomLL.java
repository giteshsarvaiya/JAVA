package DSA.LinkedList;

public class CustomLL {

    private Node head;
    private Node tail;

    private int size;

    public CustomLL(){
            this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        this.head= node;

        if(this.tail==null) this.tail = node;
        this.size++;

    }

    public void insertLast(int value){


        if(head==null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        this.size++;
    }

    public void insertAtIndex(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }

        Node node = new Node(value);
        int count = 0;
        Node temp = head;

        for (count = 0; count < index -1; count++){
            temp = temp.next;

        }
        node.next = temp.next;
        temp.next = node;
        this.size++;

    }

    public void insertAtIndexType2(int value, int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }

        int count = 0;
        Node temp = head;

        for (count = 0; count < index -1; count++){
            temp = temp.next;

        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        this.size++;

    }

    public void DeleteFirst(){
        this.head = head.next;

        if(head == null) tail = null;
        this.size--;
    }

    public void DeleteLast(){

        if(size == 1) {
            DeleteFirst();
            return;
        }

        Node temp = head;

        for (int index  = 0; index < this.size - 2; index++){
            temp = temp.next;
        }


        tail = temp;
        tail.next = null;

        this.size--;
    }

    public void DeleteAtIndex( int index){
        if (index == 0){
            DeleteFirst();;
            return;
        }
        if(index == size){
            DeleteLast();
            return;
        }
        Node temp1 = head;

        for (int count  = 0; count < index - 1; count++){
            temp1 = temp1.next;
        }

        temp1.next = temp1.next.next;


        this.size--;
    }




    public void displayAll(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void add(int value){
        this.size++;
        Node node = new Node(value);
        this.head.next = node;
    }





    private class Node {
        private int value;
        private Node next;

        public Node (int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next= next;
        }
    }
}
