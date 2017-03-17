package core.procedural.doublelist;

public class SingleUtils {
	public static void main(String[] args) {
		DoubleNode tail1 = createDoubleNode(0, 1, 2, 3);
		System.out.println("Start list: "); 
		System.out.println(toStringIter(tail1));
		tail1 = addLast(tail1, 60);		
		System.out.println("Add last to list: ");
		System.out.println(toStringIter(tail1));

		tail1 = insertInPosition(tail1, 2, 15);
		System.out.println("Insert in position list: ");
		System.out.println(toStringIter(tail1));

		tail1 = removeLast(tail1);
		System.out.println("Remove last list element: ");
		System.out.println(toStringIter(tail1));

		tail1 = removeInPosition(tail1, 1);
		System.out.println("Remove list element in position: ");
		System.out.println(toStringIter(tail1));
	}
	
	private static DoubleNode addLast(DoubleNode tail, int i) {
		return addLastIter(tail, i);
	}

	private static DoubleNode addLastIter(DoubleNode tail, int i) {
		if(tail == null) {
			return new DoubleNode(i, null, null);
		} else {
			DoubleNode ref = tail;
			while(ref.next != null){
				ref = ref.next;
			}
			ref.next = new DoubleNode(i, ref, null);			
			return tail;
		}
	}

	private static DoubleNode insertInPosition(DoubleNode tail, int index, int value) {
		return insertInPositionIter(tail, index, value);
	}

	private static DoubleNode insertInPositionIter(DoubleNode tail, int index, int value) {
		if(tail == null) {
			return new DoubleNode(value, null, null);
		} 
		if(index == 0) {			
			tail.prev = new DoubleNode(value, null, tail);
			tail = tail.prev;
			return tail;
		}
		else {
			DoubleNode ref = tail;
			int count = 1;
			while(ref.next != null && count != index){				
				ref = ref.next;
				count++;
			}
			if(ref.next == null) {
				tail = addLast(tail, value);
			} else {
				ref.next.prev = new DoubleNode(value, ref, ref.next);
				ref.next = ref.next.prev;
			}
			return tail;
		}
	}

	private static DoubleNode removeLast(DoubleNode tail) {
		return removeLastIter(tail);
	}

	private static DoubleNode removeLastIter(DoubleNode tail) {
		if(tail == null || tail.next == null) {
			return null;
		} else {
			DoubleNode ref = tail;
			while(ref.next.next != null){
				ref = ref.next;
			}
			ref.next = null;
			return tail;
		}
	}

	private static DoubleNode removeInPosition(DoubleNode tail, int index) {
		return removeInPositionIter(tail, index);
	}

	private static DoubleNode removeInPositionIter(DoubleNode tail, int index) {
		if(tail == null) {
			return null;
		}
		if(index == 0) {
			tail.next.prev = null;
			return tail.next;
		}
		else {
			DoubleNode ref = tail;
			int count = 1;
			while(ref.next != null && count != index){
				ref = ref.next;
				count++;
			}
			if(ref.next == null) {
				tail = removeLast(tail);
			} else {
				ref.next.next.prev = ref.next.prev;
				ref.next = ref.next.next;
			}
			return tail;
		}
	}

	private static DoubleNode createDoubleNode(int... v) {
		DoubleNode tail = new DoubleNode(v[0], null, null);
		DoubleNode ref = tail;
		for(int i = 1; i < v.length; i++){
			ref.next = new DoubleNode(v[i], ref, null);
			ref = ref.next;
		}		
		return tail;
	}

	private static String toStringIter(DoubleNode tail) {
		String result = "";		
		while(tail != null) {
			result += "<-";
			result += tail.prev == null ? "*" : tail.prev.value;
			result += "-(" + tail.value + ")-";
			result += tail.next == null ? "*" : tail.next.value;
			result += "->";
			tail = tail.next;
		}		
		return result;
	}
}
