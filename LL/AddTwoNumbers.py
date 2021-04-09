#LEETCODE
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        resultHead = ListNode()
        ans = resultHead
        p = l1
        q = l2
        carry = 0
        while p!= None or q!=None:
            if p!=None:
                v1 = p.val
                p=p.next
            else:
                v1 = 0
            
            if q!=None:
                v2 = q.val
                q=q.next
            else:
                v2 = 0
            
            resultHead.next = ListNode((v1+v2+carry)%10)
            print(v1,v2,carry,'->',(v1+v2+carry)//10,(v1+v2+carry)%10)
            carry = (v1+v2+carry)//10
            resultHead = resultHead.next
        if(carry!=0):
            resultHead.next = ListNode(carry)
        return ans.next  
            if q!=None:
                v2 = q.val
                q=q.next
            else:
                v2 = 0
            
            resultHead.next = ListNode((v1+v2+carry)%10)
            print(v1,v2,carry,'->',(v1+v2+carry)//10,(v1+v2+carry)%10)
            carry = (v1+v2+carry)//10
            resultHead = resultHead.next
        if(carry!=0):
            resultHead.next = ListNode(carry)
        return ans.next