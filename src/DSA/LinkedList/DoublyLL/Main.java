package DSA.LinkedList.DoublyLL;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        CustomDLL list = new CustomDLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3 );
        list.displayAll();
        System.out.println(list.getSize());
    }
}
