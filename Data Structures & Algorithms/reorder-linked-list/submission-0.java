/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if(head==null) return;
        ArrayList<ListNode> list=new ArrayList<>();

        ListNode curr=head;
        while(curr!=null){
            list.add(curr);
            curr=curr.next;
        }
        int i=0;
        int j=list.size()-1;

        while(i<j){
            ListNode left=list.get(i);
            ListNode right=list.get(j);
            left.next=right;
            i++;
            if(i==j) break;
            right.next=list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}
