/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Saaduddin
 */
public class Stack extends ListBasedCollection {

    public void push(int data) {
        Node n = new Node(data);

        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public int pop() throws Exception {
        Node deleted = null;
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
          
        }
        
        else{
            deleted = head; 
            head = head.next;
            
            }
 
        return deleted.data; 
        }

    public int top() throws Exception{
        
     
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
           
        }
 
         return head.data; 
    }

 
    
} //end of class
