package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	public void  searchMap(String[] word) {
		HashMap<String,String> dictionary = new HashMap<>();
		
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");

     	for ( int i = 0 ; i < word.length ; i++) {
			if ( dictionary.containsKey(word[i]) ) {
				System.out.println(word[i] + "の意味は" + dictionary.get(word[i]));
			} else {
				System.out.println(word[i] + "の意味は存在しません");
			}
	  	}
	
      }
	
}
