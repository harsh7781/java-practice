package InterviewQuestions;
//LeetCode - 21

public class MergeTwoSortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        ListNode temp1=list1,temp2=list2;
        ListNode head=null, tail=null;

        while(temp1!=null&&temp2!=null){
            if(temp1.val<=temp2.val){
                if(head==null){
                    head=temp1;
                    tail=temp1;
                }
                else{
                    tail.next=temp1;
                    tail=tail.next;
                }
                temp1=temp1.next;
            }else{

                if(head==null){
                    head=temp2;
                    tail=temp2;
                }
                else{
                    tail.next=temp2;
                    tail=tail.next;

                }
                temp2=temp2.next;

            }


        }

        if(temp1!=null){

            tail.next=temp1;
        }
        if(temp2!=null){
            tail.next=temp2;
        }

        return head;
    }
}
