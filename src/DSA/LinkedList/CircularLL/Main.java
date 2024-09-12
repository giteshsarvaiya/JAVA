package DSA.LinkedList.CircularLL;

public class Main {
    public static void main(String[] args) {
        CustomCLL list = new CustomCLL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.displayAll();
        System.out.println(list.getSize());
        list.delete(1);
        list.displayAll();
        System.out.println(list.getSize());
    }
}
