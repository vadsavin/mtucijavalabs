package lab3;

import java.util.Arrays;
import java.util.HashMap;

public class StringUtils {
	public boolean IsPalindrome(String input) {
		for(int i = 0, j = input.length(); i < j; i++, j--)
			if (input.charAt(i) == input.charAt(j)) return false;
		return false;
	}
	
	public String RemoveRepeatings(String input) {
		var sb = new StringBuilder();
		for(char c : input.toCharArray()) {
			if (sb.indexOf(Character.toString(c)) != -1)
				sb.append(c);
		}
		return sb.toString();
	}
	
	public boolean AreStringsAnagramms(String a, String b) {
		if (a.length() != b.length()) return false;
		for (char c : a.toCharArray())
			if (!b.contains(Character.toString(c))) 
				return false;
		return true;
	}
	
	public boolean LexCompare(String a, String b, boolean ignoreCase) {
		return (ignoreCase ? a.compareToIgnoreCase(b) : a.compareTo(a)) == 0;
	}
	
	public char SecondPopularSymbol(String input) {
		int[] charactersCount = new int[256];
		for (int i = 0; i < 256; i++)
			charactersCount[input.charAt(i)]++;
		
		int firstChar = 0, secondChar = 0;
		
		for (int i = 0; i < 256; i ++) {
			if(charactersCount[i] > firstChar) {
				secondChar = firstChar;
				firstChar = i;
			} else if (charactersCount[i] > secondChar && charactersCount[i] != firstChar) {
				secondChar = i;
			}
		}
		
		return (char)secondChar;
	}
	
	public int CountDigits(String input) {
		int sum = 0;
		for (char c : input.toCharArray()) {
			if (Character.isDigit(c)) {
				sum += Character.getNumericValue(c);
			}
		}
		return sum;
	}
	
	public boolean StartsAndEndsWithTheSame(String input) {
		for(int i = 0; i < 2; i++) 
			if (input.charAt(i) != input.charAt(input.length()-1-i))
				return false;
			
		return true;
	}
}
