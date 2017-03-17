package core.procedural.lists;

public class App01 {

	public static void main(String[] args) {
		Node tail;
		tail = new Node(0, null);
		tail = new Node(1, tail);
		tail = new Node(2, tail);
		tail = new Node(3, tail);

		System.out.println(toStringIter(tail));
	}

	private static String toStringIter(Node tail) {
		String result = "";		
		while(tail != null) {
			result += tail.value + "->";
			tail = tail.next;		
		}
		return result + "*";
	}
	
	private static String toStringRec(Node tail) {		
		return tail == null ? "*" : tail.value + "->" + toStringRec(tail.next);		
	}
}
