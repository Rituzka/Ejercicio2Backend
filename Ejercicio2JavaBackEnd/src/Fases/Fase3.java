package Fases;

import java.util.*;

public class Fase3 {

	public static void main(String[] args) {
				
		List<Character> name = new ArrayList<Character>();
		Map<Character, Integer> lettersRepeated = new HashMap<>();
		int count = 0;
		
		name.add('R');
		name.add('I');
		name.add('T');
		name.add('A');
		name.add('C');
		name.add('A');
		name.add('S');
		name.add('I');
		
		for (int i=0; i<name.size();i++) {
			for(int j=i+1;j<name.size();j++) {
				if(name.get(i)==name.get(j)) {
					count++;
					lettersRepeated.put(name.get(i), count);				
				}else {
					count=1;
					addLetterNotRepeated(name.get(i),count,lettersRepeated);
				}
			}
		}
		
		System.out.println(lettersRepeated);
	}

public static void addLetterNotRepeated(char letter, int number, Map<Character,Integer> map) {
	if(!map.containsKey(letter)) {
	map.put(letter, number);
		}
	}
}
