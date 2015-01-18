/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

/**
 *
 * @author Saaduddin
 */
public class StringArrays {

	//This method
    public static void main(String [] args) {
        System.out.println(altPairs("Chocolate"));
    }
    
    public static String altPairs(String str) {

		if(str. length() <= 1)
		   return str; 
		   
		String s = "";
	  	if(str.length()>=2) {
			for(int i = 0; i<str.length()-1; i+=4) {
		    	s+=str.substring(i, i+2); 
			}  
		}

		return s;   
	}
}
