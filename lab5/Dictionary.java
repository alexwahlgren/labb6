package lab5;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
* Denna klass modellerar en ordlista (Dictionary). En ordlista
* associerar termer med betydelser. En term kan mappas till flera betydelser.
* Både term och betydelse representeras med klassen Word.
*/

public class Dictionary {

	public HashMap<String, String> ordlista = new HashMap<String, String>();
	private HashSet<String> numOfVal = new HashSet<String>();
	
	/**
	* Lägger till termen t till ordlistan med betydelsen m. Om termen
	* redan är tillagd med angiven betydelse händer ingenting.
	*/
	
	public void add(Word t, Word m) {
		if ( !(ordlista.containsKey(t.toString())) )
			ordlista.put(t.toString(), m.toString());
	}
	
	/**
	* Bekvämare sätt att anropa add för 2 strängar än
	* add(Word, Word).
	*/
	
	public void add(String t, String m){
		if ( !(ordlista.containsKey(t)) )
			ordlista.put(t, m);
	}
	
	/**
	* Returnerar en icke-null mängd med ordlistans alla termer.
	*/
	
	public Set<String> terms(){
		HashSet<String> nullSet = new HashSet<String>();
		
		if (ordlista.keySet() != null)
			return ordlista.keySet();
		
		else return nullSet;
	}
	
	/**
	* Slår upp och returnerar en mängd av betydelser till t, eller
	* null om t inte finns i ordlistan.
	*/
	
	public Set<String> lookup(Word t){
		numOfVal.add(ordlista.get(t.toString()));
		return numOfVal;
	}
	
	/**
	* Skapar och returnerar en ny ordlista på det motsatta språket, dvs, alla
	* betydelser blir termer och alla termer blir betydelser. T.ex. en
	* svensk-engelsk ordlista blir efter invertering engelsk-svensk.
	*/
	
	public Dictionary inverse() {
		Dictionary invDict = new Dictionary();
		for (String key : ordlista.keySet()) {
			invDict.add(ordlista.get(key), key);
		}
		return invDict;
	}

	/**
	* Läser in orden från den givna strömmen och lägger dessa i ordlistan.
	*/
	
//	public void load(InputStream is);

	/**
	* Lagrar ordlistan på den givna strömmen.
	*/

	
//	public void save(OutputStream os);


}
