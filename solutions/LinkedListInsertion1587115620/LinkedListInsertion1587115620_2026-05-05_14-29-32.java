/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        Node start = head;
        Node node = new Node(x);
        while(head != null) {
            if(head.next == null) {
                head.next = node;
                break;
            }
            head = head.next;
        }
        return start;
    }
}