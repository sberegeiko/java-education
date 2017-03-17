package core.procedural.lists;
import java.util.Arrays;

public class App02 {
	public static void main(String[] args) {
		Node tail = genRec(0, 1, 2, 3);
		System.out.println(tail);
	}
	
	public static Node genIter(int... values) {
		Node tail = null;
		for(int i = values.length - 1; i >= 0; i--){
			tail = new Node(values[i], tail);			
		}		
		return tail;
	}
	
	public static Node genRecFull(int... values) {
		if(values.length == 0) 
			return null;
		else {
			int[] newArray = Arrays.copyOfRange(values, 1, values.length);
			Node next = genRecFull(newArray);
			return new Node(values[0], next);
		}
	}
	
	public static Node genRec(int... values) {
		return values.length == 0 ? null : new Node(values[0], genRec(Arrays.copyOfRange(values, 1, values.length)));
	}
}
