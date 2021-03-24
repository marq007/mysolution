package medium;

import java.util.ArrayList;
import java.util.List;

public class FindandReplacePattern {

	public static void main(String[] args) {
		FindandReplacePattern sol = new FindandReplacePattern();
		
		//System.out.println(sol.findAndReplacePattern(new String[] {"abc","deq","mee","aqq","dkd","ccc"}, "abb"));
		System.out.println(sol.findAndReplacePattern(new String[] {"abc","cba","xyx","yxx","yyx"}, "abc"));		

	}
	
	public List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> result = new ArrayList<>();
		char[] patternArr = pattern.toCharArray();
		
		//int[] patterSeq = new int[patternArr.length];
		boolean[] patterSeq = new boolean[patternArr.length];
		
		for(int i=1;i<patternArr.length;i++) {
			patterSeq[i-1] = patternArr[i-1]==patternArr[i];
		}
		patterSeq[patternArr.length-1] = patternArr[0]==patternArr[patternArr.length-1];
		
		for(String word:words) {
			if(isMatchingPatter(patterSeq, word.toCharArray())) {
				result.add(word);
			}
		}
		
		return result;
        
    }
	
	public boolean isMatchingPatter(boolean[]patterSeq, char[] letters) {
		boolean isMatching = true;
		if((patterSeq[patterSeq.length-1]) != (letters[0]==letters[patterSeq.length-1])) {
			return false;
		}
		for(int i=1;i<letters.length;i++) {
			if((patterSeq[i-1]) != (letters[i-1]==letters[i])) {
				isMatching = false;
				break;
			}
		}
		
		return isMatching;
	}

}
