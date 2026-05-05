/*
Definition for Linked List
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}
*/
class Solution {
    public int getCount(Node head) {
        int length = 0;
        while(head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
}