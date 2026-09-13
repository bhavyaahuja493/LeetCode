class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null){
        count++;
        temp=temp.next;
    }
    int index= count-n;
    if(index==0){
   return head.next;
}
 temp=head;
for(int i=0;i<index-1;i++){
    temp=temp.next;
    }
    temp.next=temp.next.next;
    
    return head;
}
    }
    
