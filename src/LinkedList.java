import java.util.Scanner;

class LinkedList {
    Node head;

    public void populate(int num){
        head = new Node(0);
        Node curr=head;
        for (int i=1; i<num-1; i++){
            Node n= new Node(i);
            curr.next=n;
            curr=curr.next;
        }
    }

    //this method insert a node in the fourth location
    public void insertAtFourth(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        int count = 1;

        // Trying to find the third node (one position before the desired position)
        while (current != null && count < 3) {
            current = current.next;
            count++;
        }


        // Inserting the new node at the fourth position
        newNode.next = current.next;
        current.next = newNode;
    }

    public int countNodesRecursively(Node node) {
        if (node.next == null) {
            return 1;
        } else {
            return 1 + countNodesRecursively(node.next);
        }
    }


    public int getCount() {
        return countNodesRecursively(head);
    }


    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        // Adding some nodes to the list
        list.populate(num);

        // Inserting a new node at the fourth position
        list.insertAtFourth(40);
        int count = list.getCount();
        System.out.println("Number of nodes in the list: " + count);


        // Output the list to see the result
        Node current = list.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
