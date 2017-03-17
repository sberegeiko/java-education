package core.procedural.lists;

public class App10CopyEqual {
    public static void main(String[] args) {
        Node tail1 = createNode(10, 20, 30, 40);
        Node tail2 = copy(tail1);
        Node tail3 = merge(tail1, tail2);
        System.out.println(toStringIter(tail1));
        System.out.println(toStringRec(tail2));
        System.out.println(toStringRec(tail3));

        System.out.println(isEqual(tail1, tail2));

        tail2.next.next.value = 100;
        System.out.println(toStringIter(tail1));
        System.out.println(toStringRec(tail2));
        System.out.println(toStringRec(tail3));

        System.out.println(isEqual(tail1, tail2));
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
