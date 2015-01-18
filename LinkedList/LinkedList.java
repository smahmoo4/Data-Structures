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
class LinkedList {

    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return (head == null);
    }

    public void append(int data) {
    //add to back of list, reassigning null pointer
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void prepend(int data) {
        //add to the front of the list sliding everything right
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }

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

    public int[] getDataFromStart() {
        //pull data forwards
        int newArr[] = new int[getNodeCount()];
        Node n = head;
        int i = 0;
        while (n != null) {
            newArr[i] = n.data;
            i++;
            n = n.next;
        }
        return newArr;
    }

    public int[] getDataFromEnd() {
        //pull data backwards
        int newArr[] = new int[getNodeCount()];
        Node n = head;
        int i = getNodeCount() - 1;
        while (n != null) {
            newArr[i] = n.data;
            i--;
            n = n.next;
        }
        return newArr;
    }

    public void reverseLinkedList() {
        //reverse pointers to Linked List
        Node p = null;
        Node c = head;
        Node n = null;

        if (c == null) {
            return;
        }

        while (c.next != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }

        c.next = p;
        tail = head;
        head = c;
    }

    public void reverseRecursive() {
        tail = head;
        head = doReverse(head);
        head.next = null;
    }

    private Node doReverse(Node n) {
        if (n.next == null) {
            return n;
        }
        return doReverse(n.next).next = n;
    }

    public int indexOf(int data) {
        //index of data
        Node n = head;
        int index = 0;
        boolean found = false;
        while (n != null) {
            if (n.data == data) {
                found = true;
                break;
            }
            n = n.next;
            index++;
        }

        return found ? index : -1;
    }

    public int getDataAt(int index) {
        //get Data at specific index
        Node n = head;
        int count = -1;
        while (n != null) {
            count++;
            if (count == index) {
                break;
            }
            n = n.next;
        }
        return n.data;
    }

    public int getDataAtFromEnd(int indexFromEnd) {
        Node n = head;
        int count = 0;
        Node p1 = head;
        Node p2 = head;
        while (n != null && count != indexFromEnd) {
            count++;
            p1 = p1.next;
        }

        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p2.data;
    }

    public void insertAt(int data, int x) {
        if (x == 0) {
            prepend(data);
            return;
        }
        Node n = new Node(data);
        Node c = head;
        int count = -1;
        while (c != null) {
            count++;
            if (count == x - 1) {
                n.next = c.next;
                c.next = n;
                break;
            }
            c = c.next;
        }
        if (n.next == null) {
            tail = n;
        }
    }

    public void insertSorted(int data) {
        Node n = new Node(data);
        Node c = head;

        while (n.next != null) {
            if (n.data < c.data) {
                n = head;
                n.next = c;
            }

            if (n.data > c.data) {
                c.next = n;
            }
        }
        tail = n;
    }

    public void deleteAt(int x) {
        //delete element at index; shifting remaining elements to left
        if (x == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        }
        Node n = head;
        int count = -1;
        while (n != null) {
            count++;
            if (count == x - 1) {
                n.next = n.next.next;
                break;
            }
            n = n.next;
        }

        if (n.next == null) {
            tail = n;
        }

    }

    public void sort() {
        //need a second list
        Node h2 = null;
        Node t2 = null;

        while (head != null) {
            boolean maxAtHead = false;
            Node n = head;
            Node ptr2max = n;
            while (n.next != null) {
                if (n.next.data > ptr2max.data) {
                    ptr2max = n;
                }
                n = n.next;
            }

            Node max = ptr2max.next;
            if (max != null) {
                ptr2max.next = max.next;
                max.next = h2;
                h2 = max;
            } else {
                ptr2max.next = h2;
                h2 = ptr2max;
                head = null;
            }

            if (t2 == null) {
                t2 = h2;
            }
        }
        head = h2;
        tail = t2;

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
