package pig.latin;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class PigLatin {

	public static ArrayList<String> vowels = new ArrayList<String>();
	static{
		
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		
	}
	
	public String pigLatin(String s) {
		String suffix = "ay";
		if(StringUtils.isNotBlank(s)){
		
			for(int i = 0; i < s.length(); i++){
				if(!vowels.contains(s.substring(i, i + 1))){
					String sub = s.substring(i+1);
					String first = s.substring(0, i+1);
					return sub+"-"+first+suffix;
				
				}
			}
		}
		return null;
	}
	
}
