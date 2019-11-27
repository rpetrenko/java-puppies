import java.util.*;
/*
Find first non-repeated character in a sting
Usage: javac FirstNonRepeating.java
       java FirstNonRepeating abcdabcf
*/
public class FirstNonRepeating {
    public static Character process(String v) {
	HashMap<Character, ArrayList<Integer>> map = new HashMap();
	for (int i=0; i<v.length(); i++) {
	    Character ch = v.charAt(i);
	    if (map.containsKey(ch)) {
	        map.get(ch).add(i);
	    } else {
	        ArrayList<Integer> alist = new ArrayList();
		alist.add(i);
		map.put(ch, alist);
	    }

	}
	ArrayList<Integer> indices = new ArrayList();
	for (Map.Entry<Character, ArrayList<Integer>> entry: map.entrySet()) {
	    Character key = entry.getKey();
	    ArrayList<Integer> values = entry.getValue();
	    //System.out.println(key + ":" + values);
	    
	    if (values.size() == 1) {
	        indices.add(values.get(0));
	    }
	}
	Integer mini = Collections.min(indices);
	//System.out.println(mini);
	return v.charAt(mini);
    }
    public static void main(String args[]) {
        Character result = process(args[0]);
        System.out.println("First non-repeating character: " + result);
    }
}

