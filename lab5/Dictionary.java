package lab5;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Dictionary {

	private HashMap<String, String> ordlista = new HashMap<String, String>();
	private HashSet<String> numOfVal = new HashSet<String>();
	
	public void add(Word t, Word m) {
		if ( !(ordlista.containsKey(t.toString())) )
			ordlista.put(t.toString(), m.toString());
	}
	
	public void add(String t, String m){
		if ( !(ordlista.containsKey(t)) )
			ordlista.put(t, m);
	}
	
	public Set<String> terms(){
		HashSet<String> nullSet = new HashSet<String>();
		
		if (ordlista.keySet() != null)
			return ordlista.keySet();
		
		else return nullSet;
	}
	
	public Set<String> lookup(Word t){
		numOfVal.add(ordlista.get(t.toString()));
		return numOfVal;
	}
	
	public Dictionary inverse() {
		Dictionary invDict = new Dictionary 
	}

	public void load(InputStream is);
	
	public void save(OutputStream os);


}
