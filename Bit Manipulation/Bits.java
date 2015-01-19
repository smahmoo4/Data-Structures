/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BitOps;

/**
 *
 * @author Saaduddin
 */
public class Bits {

    public static void main(String[] args) {

        //System.out.println(int2BitString(3));
        //System.out.print(getBit(5, 0));
        //System.out.println(string2Bits("21", 2));
        //System.out.println(parseFromBase("1", 16));
        //System.out.println(intToBase(125, 2));
        //System.out.println(reverseBits(8));
        //System.out.println(getOnesCount(9));
    }

    public static String int2BitString(int n) {
        char[] bits = new char[]{'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0'};
        int index = 31;
        while (n > 0) {
            bits[index--] = (char) ((n & 1) + 48);
            n >>= 1;
        }
        return new String(bits);
    }

    public static String intToBase(int num, int base) {
        //"0000000000011" => 3
        String result = "";

        if (num == 0) {
            return "0";
        }

        while (num != 0) {
            int remainder = num % base;
            num = num / base;
            result = remainder + result;
        }
        return result;
    }

    public static int parseFromBase(String numString, int base) {
        //"0000000000011" => 3

        int n = 0;
        int cur = 1;

        for (int power = 0; power < numString.length(); power++) {
            int digit = (int) (numString.charAt(numString.length() - 1 - power) - 48);
            //48 = ASCII of '0'; 
            n += (digit * cur);
            cur *= base;
        }

        return n;
    }

    public static int getBit(int n, int position) { //in n, return bit at position;

        return (n >> (position)) & 1;
    }

    public static int invertBit(int n, int position) {
        return n ^ (1 << position);
    }

    public static int invertAllBits(int n) {
        return n ^ (0xFFFFFFFF);
    }

    public static int setBit(int n, int position, int bit) {
        return bit == 1 ? n | (bit << position) : n & (bit << position);
    }

    public static int reverseBits(int n) {
        int x = 0;
        while (n != 0) {
          x=x<<1;
          x = x | (n & 1);
          n=n>>1;
        }
       return x;
    }
    
    public static int getOnesCount(int n){
      if(n==0)
          return 0; 
      int x = 0; 
      
      int count = 0; 
      while(n!=0)
      {
          x=x<<1;
          x=x|(n&1);
          n=n>>1;
      }
      
      return x; 
    }
}
