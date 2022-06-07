public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
  HashSet<ListNode> set = new HashSet<>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
}

// in above code time complexity O(n+m)


ListNode l1 = headA , l2 = headB;
         
         if(l1 == null || l2 == null)
            return null;
         
         while(l1 != l2)
         {
             l1 = l1 == null ? headB : l1.next;
             l2 = l2 == null ? headA : l2.next;
         }
         
         if(l1 != null && l2 != null)
            return l1;
         else
            return null;
    }
}


// above code time complexitym O(n)


