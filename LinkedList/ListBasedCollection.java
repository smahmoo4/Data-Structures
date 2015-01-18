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
public abstract class ListBasedCollection {
    protected Node head;
    protected Node tail;
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int getNodeCount() {
        //get number of links
        Node n = head;
        int count = 0;
        while (n != null) {
            count++;
            n = n.next;
        }
        return count;
    }
    
    public String Print() {
        String s = "Count=" + getNodeCount() + " ";

        if (head == null) {
            s += " Head=null";
        } else {
            s += "Head=" + head.data;
        }

        if (tail == null) {
            s += " Tail=null";
        } else {
            s += " Tail=" + tail.data;
        }
        s += " {";

        Node n = head;

        while (n != null) {
            s += n.data + ", ";
            n = n.next;
        }
        s += "}";
        return s;
    }
   
}
