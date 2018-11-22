package lab5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

/**
* Denna klass modellerar en ordlista (Dictionary). En ordlista
* associerar termer med betydelser. En term kan mappas till flera betydelser.
* B�de term och betydelse representeras med klassen Word.
*/

public class Dictionary {

	public HashMap<Word, Set<Word>> ordlista = new HashMap<Word, Set<Word>>();
	private Set<Word> setOfValues = new HashSet<Word>();
	
	/**
	* L�gger till termen t till ordlistan med betydelsen m. Om termen
	* redan �r tillagd med angiven betydelse h�nder ingenting.
	*/
	
	public void add(Word t, Word m) {
		if(ordlista.containsKey(t)) {
			Set<Word> meanings = ordlista.get(t);
			meanings.add(m);
			return;
		}
		Set<Word> meanings = new HashSet<Word>();
		meanings.add(m);
		ordlista.put(t, meanings);
		
		
//		
//		if ( !(lookup(t).contains(m)) )
//			setOfValues.add(m);
//			ordlista.put(t, setOfValues);
	}
	
	/**
	* Bekv�mare s�tt att anropa add f�r 2 str�ngar �n
	* add(Word, Word).
	*/
	
	public void add(String t, String m){
		add(new Word(t), new Word(m));
		
	}
	
	/**
	* Returnerar en icke-null m�ngd med ordlistans alla termer.
	*/
	
	public Set<Word> terms(){
		HashSet<Word> nullSet = new HashSet<Word>();
		nullSet.add(new Word("null"));
		HashSet<Word> notNullSet = new HashSet<Word>();
		
		if (ordlista.keySet() != null) {
			for (Word key : ordlista.keySet()) {
				notNullSet.add(key); 
			}
			return notNullSet;
		}
		else return nullSet;
	}
	
	/**
	* Sl�r upp och returnerar en m�ngd av betydelser till t, eller
	* null om t inte finns i ordlistan.
	*/
	
	public Set<Word> lookup(Word t){
		if (setOfValues != null) {
			return ordlista.get(t);
		}
		else return null;
	}
	
	/**
	* Skapar och returnerar en ny ordlista p� det motsatta spr�ket, dvs, alla
	* betydelser blir termer och alla termer blir betydelser. T.ex. en
	* svensk-engelsk ordlista blir efter invertering engelsk-svensk.
	*/
	
	public Dictionary inverse() {
		Dictionary invDict = new Dictionary();
		for (Word key : ordlista.keySet()) {
			for (Word value : ordlista.get(key))
			invDict.add(ordlista.get(key).iterator().next(), key);
		}
		return invDict;
	}

	/**
	* L�ser in orden fr�n den givna str�mmen och l�gger dessa i ordlistan.
	*/
	
	public void load() {
		String FILENAME = "C:\\Users\\alexw\\eclipse_workspace\\TDDC77labs\\src\\lab5\\infile.txt";
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);
			
			String sCurrentLine;
			
			while ((sCurrentLine = br.readLine()) != null) {
				
				String keyAndValue[] = sCurrentLine.split(";");
				for (int n=0; n<keyAndValue.length; n++) {
					if(n%2 == 0) {
						add(keyAndValue[n], keyAndValue[n+1]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/**
	* Lagrar ordlistan p� den givna str�mmen.
	*/

	
	public void save(String input) {
		String FILENAME = "C:\\Users\\alexw\\eclipse_workspace\\TDDC77labs\\src\\lab5\\infile.txt";
		FileWriter fw;
		BufferedWriter bw;
		try {
			fw = new FileWriter(FILENAME, true);
			bw = new BufferedWriter(fw);
			bw.append("\n");
			bw.append(input);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
