package core.procedural.lists;

public class SingleUtils {
    public static void main(String[] args) {
        Node tail1 = createNode(10, 20, 30, 40);
        System.out.println("Start list: ");
        System.out.println(toStringIter(tail1));
        tail1 = addLast(tail1, 60);
        System.out.println("Add last to list: ");
        System.out.println(toStringIter(tail1));

        tail1 = insertInPosition(tail1, 1, 15);
        System.out.println("Insert in position list: ");
        System.out.println(toStringIter(tail1));

        tail1 = removeLast(tail1);
        System.out.println("Remove last list element: ");
        System.out.println(toStringIter(tail1));

        tail1 = createNode(10, 20, 30);
        tail1 = removeInPosition(tail1, 1);
        System.out.println("Remove list element in position: ");
        System.out.println(toStringIter(tail1));
    }

    private static Node addLast(Node tail1, int i) {
        return addLastIter(tail1, i);
//		return addLastRec(tail1, i);
    }

    private static Node addLastIter(Node tail1, int i) {
        if (tail1 == null) {
            return new Node(i, null);
        } else {
            Node ref = tail1;
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = new Node(i, null);
            return tail1;
        }
    }

    private static Node addLastRec(Node tail1, int i) {
        return tail1 == null ? new Node(i, null) : new Node(tail1.value, addLastRec(tail1.next, i));
    }

    private static Node insertInPosition(Node tail, int index, int value) {
//		return insertInPositionIter(tail, index, value);
        return insertInPositionRec(tail, index, value);
    }

    private static Node insertInPositionIter(Node tail, int index, int value) {
        if (tail == null) {
            return new Node(value, null);
        }
        if (index == 0) {
            return new Node(value, tail);
        } else {
            Node ref = tail;
            int count = 1;
            while (ref.next != null && count != index) {
                ref = ref.next;
                count++;
            }
            ref.next = new Node(value, ref.next);
            return tail;
        }
    }

    private static Node insertInPositionRec(Node tail, int index, int value) {
        return (tail == null || index == 0) ? new Node(value, tail)
                : new Node(tail.value, insertInPositionRec(tail.next, --index, value));
    }

    private static Node removeLast(Node tail) {
//		return removeLastIter(tail);
        return removeLastRec(tail);
    }

    private static Node removeLastIter(Node tail) {
        if (tail == null || tail.next == null) {
            return null;
        } else {
            Node ref = tail;
            while (ref.next.next != null) {
                ref = ref.next;
            }
            ref.next = null;
            return tail;
        }
    }

    private static Node removeLastRec(Node tail) {
        return (tail == null || tail.next == null) ? null : new Node(tail.value, removeLastRec(tail.next));
    }

    private static Node removeInPosition(Node tail, int index) {
        return removeInPositionIter(tail, index);
//		return removeInPositionRec(tail, index);
    }

    private static Node removeInPositionIter(Node tail, int index) {
        if (tail == null) {
            return null;
        }
        if (index == 0) {
            return tail.next;
        } else {
            Node ref = tail;
            int count = 1;
            while (ref.next != null && count != index) {
                ref = ref.next;
                count++;
            }
            ref.next = ref.next.next;
            return tail;
        }
    }

    private static Node removeInPositionRec(Node tail, int index) {
        return tail == null ? null : index == 0 ? tail.next :
                new Node(tail.value, removeInPositionRec(tail.next, --index));
    }

    private static boolean isEqual(Node tail1, Node tail2) {
        if (tail1 != null && tail2 != null) {
            return (tail1.value == tail2.value) && isEqual(tail1.next, tail2.next);
        } else {
            return tail1 == tail2;
        }
    }

    private static Node copy(Node tail1) {
        return tail1 == null ? null : new Node(tail1.value, copy(tail1.next));
    }

    private static Node merge(Node tail1, Node tail2) {
        if (tail1 != null && tail2 != null) {
            if (tail1.value < tail2.value)
                return new Node(tail1.value, merge(tail1.next, tail2));
            else
                return new Node(tail2.value, merge(tail2.next, tail1));
        } else {
            return (tail1 == null) ? tail2 : tail1;
        }
    }

    private static Node createNode(int... v) {
        Node tail = null;
        for (int i = v.length - 1; i >= 0; i--) {
            tail = new Node(v[i], tail);
        }
        return tail;
    }

    private static String toStringIter(Node tail) {
        String result = "";
        while (tail != null) {
            result += tail.value + "->";
            tail = tail.next;
        }
        return result + "*";
    }

    private static String toStringRec(Node tail) {
        return tail == null ? "*" : tail.value + "->" + toStringRec(tail.next);
    }
}
