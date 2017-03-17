package core.procedural.lists;

public class App10 {
	public static void main(String[] args) {
		Node tail = createNode(0, 1, 2, 3);
		System.out.println(toStringIter(tail));
		System.out.println(toStringRec(tail));
	}

	private static Node createNode(int... v) {
		Node tail = null;
		for(int i = v.length - 1; i >= 0; i--){
			tail = new Node(v[i], tail);			
		}		
		return tail;
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
