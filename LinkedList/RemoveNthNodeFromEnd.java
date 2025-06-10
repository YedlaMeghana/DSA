/* Remove N-th node from the end of a Linked List
Problem Statement: Given a linked list and an integer N, the task is to delete the Nth node from the end of the linked list and print the updated linked list. */ 
class Node {
    public int data;
    public Node next;

    // Constructor for Node with data and next node
    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor for Node with only data (next set to null)
    public Node(int data1) {
        data = data1;
        next = null;
    }
}


class Main {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static Node removeNthFromEnd(Node head, int n) {
        int len = 0;
        Node temp = head;

        // Step 1: Find the total length of the list
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Step 2: If we're removing the first node
        if (n == len) {
            return head.next;
        }

        // Step 3: Move to the node just before the one to be deleted
        temp = head;
        for (int i = 1; i < len - n; i++) {
            temp = temp.next;
        }

        // Step 4: Delete the node
        temp.next = temp.next.next;

        return head;
    }
   public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        // Delete the Nth node from 
        // the end and print the modified linked list
        head = removeNthFromEnd(head, N);
        printLL(head);
    }

}

//OUTPUT: 1 2 4 5
