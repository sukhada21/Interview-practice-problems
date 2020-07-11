package StringProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CountingSubString {
	
	public static void main(String args[]) {
		
		String s = "pww";
		String temp ="";
        int ans=0;
        for(int i=0;i<=s.length()-1;i++){
        	for(int j=i+1; j<=s.length()-1;j++) {
        		
        		if(checkUnique(s.substring(i, j))==0) {
        			break;
        		}else if(checkUnique(s.substring(i, j)) > ans) {
        			
        			ans =checkUnique(s.substring(i, j));
        			
        			
        		}
        		
        	} 	
             
        }
        
        System.out.println("Using Brute Force " + ans);
        
        System.out.println("Using Hashset" +usinghas(s));
	}
	
	public static int checkUnique(String s) {
		
		String temp ="";
		for(int i=0; i<= s.length()-1;i++) {
			
			if(temp.contains(String.valueOf(s.charAt(i)))){
				return 0;
			}else {
				
				temp = temp + s.charAt(i);
				
			}
			
		}
		
		return temp.length();
	}

	public static int usinghas(String s) {
		int ans=0,i = 0,j=0;
		int n = s.length();
		Set<Character> set = new HashSet<>();
		 while (i < n && j < n) {
	         // try to extend the range [i, j]
	         if (!set.contains(s.charAt(j))){
	             set.add(s.charAt(j++));
	             ans = Math.max(ans, j - i);
	         }
	         else {
	             set.remove(s.charAt(i++));
	         }
	     }
		 return  ans;
	}
}
