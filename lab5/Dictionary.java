package lab5;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
* Denna klass modellerar en ordlista (Dictionary). En ordlista
* associerar termer med betydelser. En term kan mappas till flera betydelser.
* B�de term och betydelse representeras med klassen Word.
*/

public class Dictionary {

	public HashMap<String, String> ordlista = new HashMap<String, String>();
	private HashSet<String> numOfVal = new HashSet<String>();
	
	/**
	* L�gger till termen t till ordlistan med betydelsen m. Om termen
	* redan �r tillagd med angiven betydelse h�nder ingenting.
	*/
	
	public void add(Word t, Word m) {
		if ( !(ordlista.containsKey(t.toString())) )
			ordlista.put(t.toString(), m.toString());
	}
	
	/**
	* Bekv�mare s�tt att anropa add f�r 2 str�ngar �n
	* add(Word, Word).
	*/
	
	public void add(String t, String m){
		if ( !(ordlista.containsKey(t)) )
			ordlista.put(t, m);
	}
	
	/**
	* Returnerar en icke-null m�ngd med ordlistans alla termer.
	*/
	
	public Set<String> terms(){
		HashSet<String> nullSet = new HashSet<String>();
		
		if (ordlista.keySet() != null)
			return ordlista.keySet();
		
		else return nullSet;
	}
	
	/**
	* Sl�r upp och returnerar en m�ngd av betydelser till t, eller
	* null om t inte finns i ordlistan.
	*/
	
	public Set<String> lookup(Word t){
		numOfVal.add(ordlista.get(t.toString()));
		return numOfVal;
	}
	
	/**
	* Skapar och returnerar en ny ordlista p� det motsatta spr�ket, dvs, alla
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
	* L�ser in orden fr�n den givna str�mmen och l�gger dessa i ordlistan.
	*/
	
//	public void load(InputStream is);

	/**
	* Lagrar ordlistan p� den givna str�mmen.
	*/

	
//	public void save(OutputStream os);


}
