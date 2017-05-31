/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_queue;

/**
 *
 * @author yamamotoai
 */
public class QueueMain {

    public static void main(String[] args) {
          Queue q = new Queue();  
          q.print();
  q.enQueue(0);
  q.enQueue(23);  
  q.enQueue(2);  
  q.enQueue(73);  
  q.enQueue(21);
  q.print();
  q.deQueue();
  q.deQueue();  
  q.deQueue();  
//  q.deQueue(); 
  
  q.print();
    }
}
/*
Element 0 is pushed to Queue !
Elements in Queue : 
0
Element 23 is pushed to Queue !
Elements in Queue : 
0
23
Element 2 is pushed to Queue !
Elements in Queue : 
0
23
2
Overflow !
Overflow !
Pop operation done !
Elements in Queue : 
23
2
Pop operation done !
Elements in Queue : 
2
Pop operation done !
Underflow !
*/