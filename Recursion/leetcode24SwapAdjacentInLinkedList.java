
    class leetcode24SwapAdjacentInLinkedList {
        public ListNode swapPairs(ListNode head) {
            solve(head);
            return head;
            
            
        }
        
        public static void solve(ListNode head){
            if(head==null || head.next==null){
                return;
            }
            
            int v = head.val;
            head.val = head.next.val;
            head.next.val = v;
            
            solve(head.next.next);
        }
        
        
    }

