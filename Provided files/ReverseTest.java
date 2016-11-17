import java.util.Arrays;

public class ReverseTest {
    public static void main(String[] args) {
        System.out.println("ARRAY LIST");
        ListInterface<Character> arrayList1 = new ArrayList<>();
        arrayList1.add('A');
        arrayList1.add('B');
        arrayList1.add('C');
        arrayList1.add('D');
        arrayList1.add('E');
        System.out.println("Original:");
        System.out.println(Arrays.toString(arrayList1.toArray()));
        arrayList1.reverse();
        System.out.println("Reversed:");
        System.out.println(Arrays.toString(arrayList1.toArray()));

        ListInterface<Character> arrayList2 = new ArrayList<>();
        arrayList2.add('A');
        arrayList2.add('B');
        arrayList2.add('C');
        arrayList2.add('D');
        arrayList2.add('E');
        arrayList2.add('F');
        System.out.println("Original:");
        System.out.println(Arrays.toString(arrayList2.toArray()));
        arrayList2.reverse();
        System.out.println("Reversed:");
        System.out.println(Arrays.toString(arrayList2.toArray()));

        System.out.println("\nLINKED LIST");
        ListInterface<Character> linkedList1 = new LinkedList<>();
        linkedList1.add('A');
        linkedList1.add('B');
        linkedList1.add('C');
        linkedList1.add('D');
        linkedList1.add('E');
        System.out.println("Original:");
        System.out.println(Arrays.toString(linkedList1.toArray()));
        linkedList1.reverse();
        System.out.println("Reversed:");
        System.out.println(Arrays.toString(linkedList1.toArray()));

        ListInterface<Character> linkedList2 = new LinkedList<>();
        linkedList2.add('A');
        linkedList2.add('B');
        linkedList2.add('C');
        linkedList2.add('D');
        linkedList2.add('E');
        linkedList2.add('F');
        System.out.println("Original:");
        System.out.println(Arrays.toString(linkedList2.toArray()));
        linkedList2.reverse();
        System.out.println("Reversed:");
        System.out.println(Arrays.toString(linkedList2.toArray()));

    }
}
