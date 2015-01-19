/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Strings;

/**
 *
 * @author Saaduddin
 */
class stringYak {

public static void main(String[] args) {
        System.out.println(stringYak("yaksup"));
}
	
 public static String stringYak(String str) {
    String result =""; 
     
    for(int i = 0; i<str.length(); i++) {
        if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') 
            i = i+2;
        else
            result = result + str.charAt(i);
    }
        
        return result;
    }
 
}