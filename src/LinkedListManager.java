public class LinkedListManager {

    private class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }


    public static void main(String[] args) {
        System.out.println("Linked lists!");
    }
}
