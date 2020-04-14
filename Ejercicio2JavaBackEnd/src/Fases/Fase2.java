
package Fases;

import java.util.*;

public class Fase2 {

	public static void main(String[] args) {
		
		List<Character> name = new ArrayList<Character>();
		
		name.add('R');
		name.add('I');
		name.add('T');
		name.add('A');
		name.add('1');
	
		
		for(char letra: name) {
			if(letra=='A'|| letra=='E'|| letra=='I'|| letra=='O'|| letra=='U') {
				System.out.println(letra +" VOCAL");
				
			}else if(!Character.isLetter(letra)) {
				System.out.println(letra +" Los nombres no tienen números!");

			}else {
				System.out.println(letra +" CONSONANTE");
			}
			
		}
		
	}
}
	