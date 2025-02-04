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


    public void deleteNode(int data){
        Node current = head;

        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node with value " + data + " not found");
            return;
        }

        if (current == head) {
            head = current.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }

        else if (current == tail) {
            tail = current.prev;
            if (tail != null) {
                tail.next = null;
            } else
            {
                head = null;
            }
        }

        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        System.out.println("Node with value " + data + " deleted.");




    }


    public static void main(String[] args) {
        LinkedListManager list = new LinkedListManager();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        System.out.println();
        System.out.println("OG list");
        list.displayList();
        System.out.println();

        list.deleteNode(10);
        list.displayList();
        System.out.println();

        list.deleteNode(40);
        list.displayList();
        System.out.println();

        list.deleteNode(20);
        list.displayList();
        System.out.println();

        System.out.println();
        list.deleteNode(69420);
        list.displayList();
    }
}
