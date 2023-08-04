public class SinglyLinkedList { 
    Node head;
    Node tail;
    int size;

    public static void main(String[] args) throws Exception {
        SinglyLinkedList singlyLinkedListObject = new SinglyLinkedList();
        
        for(int i = 1; i <= 20; i++) {
            Node newNode = new Node(i);
            singlyLinkedListObject.insertFirst(newNode); 
        }   
        
        System.out.println("Size " + singlyLinkedListObject.size);
        
        System.out.println("head node value - " + singlyLinkedListObject.head.value);
        System.out.println("tail node value - " + singlyLinkedListObject.tail.value);

    }

    public void insertFirst(Node node) {
        node.next = this.head;
        
        this.head = node;
        
        if (this.tail == null) {
            this.tail = node;
        }
        
        this.size++;
    }

    public void insertLast(Node node) {
        if (this.tail != null) {
            this.tail.next = node;
        }

        this.tail = node;
        this.size++;
    }
}

class Node {
    Integer value;
    Node next;

    Node(Integer value) {
        this.value = value;
    }

    Node(Integer value, Node next) {
        this.value = value;
        this.next = next;
    }
}





