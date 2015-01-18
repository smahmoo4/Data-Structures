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
public class LinkedListTester {

    public static void main(String[] args) throws Exception {
        //TestAppend();
        //TestPrepend();
        //Test_GetDataFromStart(); 
        //Test_ReverseLinkedList(); 
        //Test_ReverseRecursive();
        //Test_InsertAt();
        //Test_DeleteAt();
        //Test_GetDataAt();
        //Test_IndexOf();
        //Test_Sort();
        //Test_GetDataAtFromEnd();
        //Test_InsertSorted(); 
        Test_Stack();
        //Test_Queue();
    }

    public static void TestAppend() {
        LinkedList list = new LinkedList();
        System.out.println(list.Print());
        list.append(1);
        System.out.println(list.Print());
        list.append(2);
        System.out.println(list.Print());
    }

    public static void TestPrepend() {
        LinkedList list = new LinkedList();
        System.out.println(list.Print());
        list.prepend(1);
        System.out.println(list.Print());
        list.prepend(2);
        System.out.println(list.Print());
    }

    public static void Test_GetDataFromStart() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        Print(ll.getDataFromStart());
        Print(ll.getDataFromEnd());
    }

    public static void Test_ReverseLinkedList() {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        ll.reverseLinkedList();
        System.out.println(ll.Print());
        ll.append(60);
        System.out.println(ll.Print());
        ll.prepend(70);
        System.out.println(ll.Print());

    }

    public static void Test_ReverseRecursive() {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        ll.reverseRecursive();
        System.out.println(ll.Print());
        ll.append(60);
        System.out.println(ll.Print());
        ll.prepend(70);
        System.out.println(ll.Print());
    }

    public static void Test_IndexOf() {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);

        System.out.println(ll.indexOf(10));
        System.out.println(ll.Print());

    }

    public static void Test_InsertAt() {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        ll.insertAt(60, 4);
        System.out.println(ll.Print());
    }

    public static void Test_DeleteAt() {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        /*ll.append(40);
         ll.append(50);*/
        System.out.println(ll.Print());
        ll.deleteAt(2);
        System.out.println(ll.Print());
    }

    public static void Test_GetDataAt() {
        LinkedList ll = new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);
        System.out.println(ll.Print());
        System.out.println(ll.getDataAt(2));
    }

    public static void Test_Sort() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(3);
        ll.append(2);
        ll.append(4);
        ll.append(0);
        ll.append(9);
        ll.append(-2);
        ll.append(-10);
        ll.append(9);
        ll.append(-11);
        System.out.println(ll.Print());
        ll.sort();
        System.out.println(ll.Print());
    }

    public static void Test_GetDataAtFromEnd() {
        LinkedList ll = new LinkedList();
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(5);
        ll.append(6);
        ll.append(7);
        ll.append(8);
        ll.append(9);
        ll.append(10);
        System.out.println(ll.Print());

        System.out.println(ll.getDataAtFromEnd(9));

    }

    public static void Test_InsertSorted() {
        LinkedList ll = new LinkedList();
        ll.insertSorted(0);
        ll.insertSorted(-1);
        ll.insertSorted(-2);
        ll.insertSorted(3);
        System.out.println(ll.Print());
    }

    private static void Print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + ",");
        }
        System.out.println("---");
    }

    public static void Test_Stack() throws Exception {
        Stack st = new Stack();
        st.push(1);
        /*st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);*/

        System.out.println("popped: " + st.pop());
        System.out.println("top: " + st.top());

        System.out.println(st.Print());
    }

    public static void Test_Queue() throws Exception {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
         System.out.println(q.Print());
        System.out.println("removed : " + q.remove());
        System.out.println(q.Print());
    }
    
    
}
