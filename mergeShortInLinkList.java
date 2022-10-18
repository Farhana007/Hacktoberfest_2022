import java.util.*;

public class mergeShortInLinkList {
       

  public static class Node { // we can write out indivitual class here also

    int data; // firsts part of llinklinst
    Node next; // next contains the imformation about next obeject that will be connected to
               // the current object

    public Node(int data) { // constructor
      this.data = data;
      this.next = null;
    }
  }
    
         // implenting merge sort in LinkList

  private Node getMid(Node head){
    Node slow = head;
    Node fast = head.next;
    while( fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow; // slow is out mid 
  }

  private Node merge(Node head1 , Node head2){
    Node mergedLL = new Node(-1);
    Node temp = mergedLL;

    while(head1 != null && head2 == null){
      if(head1.data <= head2.data){
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
      }
      else{
        temp.next = head2;
        head2 = head2.next ;
        temp = temp.next;
      }
    }

    while(head1 != null ){
      temp.next = head;
      head1 = head1.next;
      temp = temp.next;
    }
    while(head2 != null){
      temp.next = head2;
      head2 = head2.next ;
      temp = temp.next;

    }
    return mergedLL.next;
  }

  public Node mergeSort (Node head){
    if(head == null || head.next == null){
      return head;
    }

    // find mid
    Node mid = getMid(head);
    // left and right merge 
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);

    // merge
    return merge(newLeft, newRight);
  }

  public static int size; 
  public static Node head;
  public static Node tail;



public static void main (String args[]){
        
  LinkList ll = new LinkList(); // to create a new linkList
   
     ll.addFirst(1);
     ll.addFirst(2);
     ll.addFirst(3);
     ll.addFirst(4);
     ll.addFirst(5);
  
     ll.printLl();
     LinkList.head = ll.mergeSort(LinkList.head);
    
     ll.printLl();



}
}
