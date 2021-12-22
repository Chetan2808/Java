public class Linked_List {
    Node head = null;
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public void insert(int data) {
            Node n = new Node(data);
            n.next = head;
            head = n;
        }

        public void print() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");

                curr = curr.next;
            }
        }

    public static void main(String[] ag){
        Linked_List ne = new Linked_List();
        ne.insert(4);
        ne.insert(5);
        ne.insert(6);
        ne.insert(7);
        ne.insert(8);
        ne.insert(9);

        ne.print();
    }
}
