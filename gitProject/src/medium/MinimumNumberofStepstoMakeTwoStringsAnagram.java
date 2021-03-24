package medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MinimumNumberofStepstoMakeTwoStringsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumNumberofStepstoMakeTwoStringsAnagram sol = new MinimumNumberofStepstoMakeTwoStringsAnagram();
		//System.out.println(sol.minStepsFastest("leetcode", "practice"));
		//System.out.println(sol.minSteps("xxyyzzw", "xxyywww"));
		//System.out.println(sol.minSteps("friend","family"));
		//System.out.println(sol.minSteps("gctcxyuluxjuxnsvmomavutrrfb","qijrjrhqqjxjtprybrzpyfyqtzf"));
		sol.mainTechGig(new String[]{""});
	}
	
	public int minStepsMedium(String s, String t) {
        TreeMap<Character, Integer> m1 = new TreeMap<>();
        TreeMap<Character, Integer> m2 = new TreeMap<>();

        for (char c : s.toCharArray()) {
            m1.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }
        for (char c : t.toCharArray()) {
            m2.compute(c, (k, v) -> v == null ? 1 : v + 1);
        }

        int result=0;
        for(Map.Entry<Character,Integer> e:m2.entrySet()){
            char key=e.getKey();
            int val2=e.getValue();
            if(m1.containsKey(key)) {
                int val1 = m1.get(key);
                if (val1 > val2) {
                    m2.put(key,0);
                } else if (val1 < val2) {
                    m2.put(key, Math.abs(val1 - m2.get(key)));
                } else {
                    m2.put(key,0);
                    m1.put(key,0);
                }
            }
        }
        for(Map.Entry<Character,Integer> e:m2.entrySet()){
            result+=e.getValue();
        }
        return result;
    }
	class MutableInt {
		  int value = 1; // note that we start at 1 since we're counting
		  public void increment () { ++value;      }
		  public int  get ()       { return value; }
		}
	public int minSteps(String s, String t) {
        
        HashMap<Character,MutableInt > strSMap = new HashMap<>();
        
        HashMap<Character,MutableInt > strTMap = new HashMap<>();
        char[] scharArr = s.toCharArray();
        char[] tcharArr = t.toCharArray();
        
        for(int i=0;i<s.length();i++){
        	MutableInt val = strSMap.get(scharArr[i]);
            if(null !=strSMap.get(scharArr[i])) {
            	val.increment();
            }else {
            	strSMap.put(scharArr[i],new MutableInt());
            }
            if(null !=strTMap.get(tcharArr[i])) {
            	val = strTMap.get(tcharArr[i]);
            	val.increment();
            }else {
            	strTMap.put(tcharArr[i],new MutableInt());
            }
        }
        int steps = 0;
        for(char sChar : strSMap.keySet()){
        	System.out.println("count of "+sChar+" in s: "+strSMap.get(sChar));
        	System.out.println("count of "+sChar+" in t: "+strTMap.get(sChar));
        	int count = (null!=strSMap.get(sChar)?strSMap.get(sChar).get():0)-(null!=strTMap.get(sChar)?strTMap.get(sChar).get():0);
        	steps += count<0?0:count;
			/*
			 * if(null == strTMap.get(sChar)) { steps++; }else if(0 < count) { steps+=count;
			 * }
			 */
        	System.out.println("for "+sChar+" chages:"+count);
        }
        
        return steps;
    }
	
	
	public int minStepsFastest(String s, String t) {
        // Mark all characters already shared in both strings.
        // We just need to swap to match the remaining characters.
        int[] counts = new int[26];
        
        for (char c : s.toCharArray()) {
            counts[c-'a']++;
        }
        
        for (char c : t.toCharArray()) {
            counts[c-'a']--;
        }
        
        int count = 0;
        
        for (int i = 0; i < 26; i++) {
            count += Math.abs(counts[i]);
        }
        
        return count / 2;
    }
	
	public void mainTechGig (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lines = scanner.nextInt();
		for(int i=0;i<lines;i++) {
			String input = scanner.next();
			char[] inputArr = input.toCharArray();
			int countOfVowel = 0;
			int countOfConsonants = 0;

			for (char c : inputArr) {
				switch (c) {
					case 'a' : countOfVowel++;break;
					case 'e' : countOfVowel++;break;
					case 'i' : countOfVowel++;break;
					case 'o' : countOfVowel++;break;
					case 'u' : countOfVowel++;break;
					default : countOfConsonants++;
				}
			}
			
			System.out.println(countOfVowel+" "+countOfConsonants+" "+countOfConsonants*countOfVowel);
		}
		scanner.close();
	}
	
	public void solution(String input) {
		char[] inputArr = input.toCharArray();
		int countOfVowel = 0;
		int countOfConsonants = 0;

		for (char c : inputArr) {
			switch (inputArr[c]) {
				case 'a' : countOfVowel++;break;
				case 'e' : countOfVowel++;break;
				case 'i' : countOfVowel++;break;
				case 'o' : countOfVowel++;break;
				case 'u' : countOfVowel++;break;
				default : countOfConsonants++;
			}
		}
		
		System.out.println(countOfVowel+" "+countOfConsonants+" "+countOfConsonants*countOfVowel);

	}

}
