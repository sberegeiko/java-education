package core.procedural.lists;

public class App10merge {
	public static void main(String[] args) {
		Node tail1 = createNode(10, 20, 30, 40);
		Node tail2 = createNode(25, 25, 30, 45, 50);
		
		System.out.println(toStringIter(tail1));
		System.out.println(toStringRec(tail2));
		System.out.println(toStringRec(merge(tail1, tail2)));
	}
	
	private static Node merge(Node tail1,Node tail2) {
		if(tail1 != null && tail2 != null) {
			if(tail1.value < tail2.value)
				return new Node(tail1.value, merge(tail1.next, tail2));
			else 
				return new Node(tail2.value, merge(tail2.next, tail1));			
		} else {
			return (tail1 == null) ? tail2 : tail1;
		}
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
