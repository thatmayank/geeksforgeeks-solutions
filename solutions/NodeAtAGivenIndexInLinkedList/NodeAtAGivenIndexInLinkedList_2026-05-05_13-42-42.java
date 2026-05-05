/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public int GetNth(Node head, int index) {
        int len = 0;
        while(head != null) {
            len++;
            if(len == index) return head.data;
            head = head.next;
        }
        return -1; // LL is travered and index not found, i.e. index > length
    }
}