/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    public Node insertInMiddle(Node head, int x) {
        Node start = head;
        Node node = new Node(x);
        int n = 0;
        if(head == null) return node;
        while(head != null) {
            n++;
            head = head.next;
        }
        int middle = (int) Math.ceil(n/2) + 1;
        head = start;
        while(head != null) {
            middle--;
            if(middle == 0) {
                Node next = head.next;
                node.next = next;
                head.next = node;
                break;
            }
            head = head.next;
        }
        return start;
    }
}