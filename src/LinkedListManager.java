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

    private Node head;
    private Node tail;

    public void addNode (int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;

        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Displaying the linky boy

    public void displayList() {
        Node current = head;
        System.out.print("Linked list: ");

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedListManager list = new LinkedListManager();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        list.displayList();
    }
}
