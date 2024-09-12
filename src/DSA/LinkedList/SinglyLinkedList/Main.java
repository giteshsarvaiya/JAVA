package DSA.LinkedList.SinglyLinkedList;


import DSA.LinkedList.SinglyLinkedList.CustomLL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello LinkedList!");
        CustomLL list = new CustomLL();
        System.out.println(list.getSize());
        list.insertFirst(10);
        list.insertFirst(12);
        list.insertFirst(14);
        list.insertFirst(16);
        System.out.println(list.getSize());

        list.insertLast(10);
        list.insertLast(12);
        list.insertLast(14);
        list.insertLast(16);

        list.insertAtIndex(0, 0);
        list.insertAtIndex(3, 3);
        list.insertAtIndexType2(4, 4);
        list.insertAtIndex(list.getSize(), list.getSize());
        list.displayAll();
        System.out.println(list.getSize());
        list.DeleteFirst();
        list.displayAll();
        System.out.println(list.getSize());
        list.DeleteLast();
        list.displayAll();
        System.out.println(list.getSize());
        list.DeleteAtIndex(2);
        list.displayAll();
        System.out.println(list.getSize());
        System.out.println(list.find(12));
        CustomLL list2 = new CustomLL();

        list2.insertFirst(1);
        list2.displayAll();
//        list2.DeleteLast(); sout- END
//        list2.DeleteLastAtIndex(1); sout- END
//        list2.DeleteFirst(); sout- END
    }
}
