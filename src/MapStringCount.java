


/**
 * For use in the frequency analysis demo of NGramCountingTests.
 * 
 * No need to change anything here.
 * 
 * @author Nate Chenette
 *
 */

public class MapStringCount implements Comparable<MapStringCount> {
	String str;
	Integer count;

	public MapStringCount(String s, Integer ct) {
		str = s;
		count = ct;
	}
	
	public String getStr() {
		return str;
	}
	
	public Integer getCount() {
		return count;
	}

	@Override
	public int compareTo(MapStringCount other) {
		return this.count.compareTo(other.count);
	}
	
	
}