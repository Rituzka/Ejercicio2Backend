package Fases;

import java.util.*;

public class Fase4 {
	
public static void main(String[] args) {
	
	String surname = "CASIELLO";
	List<Character> surnameCharacters = new ArrayList<Character>();
	
	    
	    for(int i = 0; i<surname.length();i++){
	        surnameCharacters.add(surname.charAt(i));
	    }
	
	System.out.println(surnameCharacters);	

	}
}
