import java.util.Arrays;
public class ListTest {
    public static final String things = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    public static void main(String[] args) {
        ListInterface<Character> l1 = new ArrayList<>();
        for (int i = 0; i < things.length(); i++) {
            l1.add(things.charAt(i));
        }
        System.out.println(Arrays.toString(l1.toArray()));
        l1.reverse();
        System.out.println(Arrays.toString(l1.toArray()));

        for (int i = 0; i <= l1.getSize(); i+=2) {
            l1.add(i, '_');
        }
        System.out.println(Arrays.toString(l1.toArray()));

        l1.clear();

        for (int i = 0; i < things.length(); i++) {
            l1.add(things.charAt(i));
        }
        for (int i = 0; i <= l1.getSize(); i+=2) {
            l1.add(i, '_');
        }
        for (int i = 0; i <= l1.getSize(); i++) {
            l1.remove(i);
        }
        for (int i = 0; i <= l1.getSize()-1; i+=2) {
            l1.replace(i, '_');
        }
        System.out.println(Arrays.toString(l1.toArray()));

        for (int i = 0; i < things.length(); i++) {
            System.out.println(things.charAt(i) + ": " + l1.contains(things.charAt(i)));
        }
        while (!l1.isEmpty()) {
            l1.remove(0);
            for (int i = 0; i < l1.getSize(); i++) {
                System.out.print(l1.get(i));
            }
            System.out.println("");
        }
        assert(!l1.contains(null));
        l1.add(null);
        assert(l1.contains(null));
        l1.remove(0);
        assert(!l1.contains(null));

        l1.clear();
        l1.add('b');
        l1.add('c');
        l1.add('d');
        l1.reverse();
        System.out.println(Arrays.toString(l1.toArray()));
        l1.add('a');
        l1.reverse();
        System.out.println(Arrays.toString(l1.toArray()));
    }
}
