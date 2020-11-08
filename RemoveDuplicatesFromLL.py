def deleteDuplicates(self, head: ListNode) -> ListNode:
        #checking if head is None
        if head == None:
            return head 
        
        # making nodes for traversing
        current = head.next 
        prev = head 
        
        # traversing through the linkedList 
        while current != None:
            # if same nodes are found 
            if current.val == prev.val :
                prev.next = current.next 
                current = current.next
            else:
                # if same nodes are not found 
                current = current.next 
                prev = prev.next 
        
        return head
