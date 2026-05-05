/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        int n = 0;
        Node prev = null;
        while(head != null) {
            n++;
            if(n % 2 == 0) {
                prev.next = head.next;
            }
            prev = head;
            head = head.next;
        }
    }
}