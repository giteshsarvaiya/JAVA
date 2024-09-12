package DSA.LinkedList.DoublyLL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        CustomDLL list = new CustomDLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3 );
        list.insertLast(0);
        list.insertLast(100);
        list.insertAtIndex(0, 0);
        list.insertAtIndex(4,4);
        list.insertAtIndex(list.getSize(), list.getSize());
        list.displayAll();
        System.out.println(list.getSize());
    }
}
