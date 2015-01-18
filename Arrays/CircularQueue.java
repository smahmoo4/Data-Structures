
package Arrays;

/**
 *
 * @author Saaduddin
 */
public class CircularQueue {

    private int[] arr;
    private int h = -1;
    private int t = -1;
    private int count = 0;

    public CircularQueue(int capacity) {
        arr = new int[capacity];
    }

    public void add(int data) throws Exception {
        if (count == arr.length) {
            throw new Exception("full");
        }

        count++;

        t = t == arr.length - 1 ? 0 : t + 1;
        arr[t] = data;
    }

    /* public void push(int data) throws Exception {
     if (count == arr.length)
     throw new Exception("full");
        
     count++;
     h = h == 0 ? arr.length - 1 : h - 1;
     arr[h] = data;
     }*/
    
    public int lastIn() throws Exception {
        if (count == 0) {
            throw new Exception("empty");
        }

        count--;

        int data = arr[t];
        t = t == 0 ? arr.length - 1 : t - 1;

        return data;
    }

    public int firstIn() throws Exception {
        if (count == 0) {
            throw new Exception("empty");
        }

        count--;

        int data = arr[h];
        h = h == arr.length ? 0 : h + 1;

        return data;
    }

    public int getCount() {
        return count;
    }

    public String Print() {
        String s = "";

        if (h < t) {
            for (int i = h; i < t; i++) {
                s += arr[i] + ", ";
            }
        } else {
            for (int j = h; j < arr.length; j++) {
                s += arr[j] + ", ";
            }

            for (int k = 0; k <= t; k++) {
                s += arr[k] + ", ";
            }
        }

        return s;

    }
}
