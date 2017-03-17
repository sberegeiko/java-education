package core.collections.equalsandhash;

import java.util.Comparator;

public class StrComparator implements Comparator<String> {

	@Override
	public int compare(String str0, String str1) {
		int lenDiff = str0.length() - str1.length();
		if(lenDiff != 0) {
			return lenDiff;
		} else {
			return str0.compareTo(str1);
		}
	}
}
