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
public class Queue extends ListBasedCollection {

    public void add(int data) {
        Node n = new Node(data);
        if (!isEmpty()) {

            tail.next = n;
            tail = n;
        } else {
            head = tail = n;
        }
    }

    public int remove() throws Exception {

        if (head == null) {
            throw new Exception("empty");
        }

        Node t = head;
        head = head.next;
        return t.data;

    }

    public int front() throws Exception {
        if (head == null) {
            throw new Exception("empty");
        }
        return head.data;
    }
}//end of class
