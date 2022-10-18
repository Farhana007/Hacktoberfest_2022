import java.util.*;

public class zigZagInLinkList {
       

  public static class Node { // we can write out indivitual class here also

    int data; // firsts part of llinklinst
    Node next; // next contains the imformation about next obeject that will be connected to
               // the current object

    public Node(int data) { // constructor
      this.data = data;
      this.next = null;
    }
  }
    
  
   // Zig Zig OF Linklist 

   public void zigZag (){
    // mid 

    Node slow = head;
   Node fast = head.next;
   while( fast != null && fast.next != null){
     slow = slow.next;
     fast = fast.next.next;
   }
    Node mid = slow; // slow is out mid 

    // reverse 2nd half

    Node curr = mid.next;
    mid.next = null;
   Node prev = null;
   Node next;
 
  

   while (curr != null) {
     next = curr.next;
     curr.next = prev;
     prev = curr;
     curr = next;

   }

   Node right = prev; // head of right side
   Node left = head;

   Node nextLeft ;
    Node nextRight ;

    // Alternative Merge - zig-zig merge 
    while(left != null && right != null){
     nextLeft  = left.next;
     left.next = right;
     nextRight = right.next;
     right.next = nextLeft;

     left = nextLeft;
     right = nextRight;
    }
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
     // ll.zigZag();
    
     ll.printLl();



}
}
