public class Sieve {
    public static ListInterface<Integer> primesUpTo(int max) {
        return null;
    }

    public static void main(String[] args) {
        int end = 0;
        try {
            end = new Integer(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please use a integer parameter for maximum value");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please use a integer parameter for maximum value");
            return;
        }

        ListInterface<Integer> result = primesUpTo(end);
        if (result != null) {
            System.out.println("Primes:");
            for (int i = 0; i < result.getSize(); i++) {
                System.out.print(result.get(i) + " ");
            }
            System.out.println(" ");

        }
    }
}
