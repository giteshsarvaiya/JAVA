package DSA.LinkedList.CircularLL;
//Custom Implementation of CLL
public class CustomCLL {

    private int size;
    private Node head;
    private Node tail;

    public void insertFirst(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }

        node.next = head;
        head = node;
        tail.next = node;
        size++;
    }

    public void delete(int value){

        Node temp = head;
         if(head.value==value){
             head = head.next;
             tail = head;
             size--;
         }

         while(temp.next.value != value){

             temp = temp.next;

         }
         temp.next = temp.next.next;

         size--;

    }


    public void displayAll (){
        Node temp = head;
        if(head != null){
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println(" HEAD ");
        }


    }

    public int getSize(){
        return this.size;

    }



    CustomCLL(){
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
