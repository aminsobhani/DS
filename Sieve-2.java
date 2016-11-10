public class Sieve {
    public static ListInterface<Integer> primesUpTo(int max) {
        ListInterface<Integer> primes = new ArrayList<>();
        for (int i = 2; i < max; i++) {
            primes.add(i);
        }

        for (int i = 2; i < Math.sqrt(max); i++) {
            if (primes.contains(i)) {
                for (int j = 2*i; j < max; j += i) {
                    if (primes.contains(j)) {
                        primes.remove(primes.indexOf(j));
                    }
                }
            }
        }

        return primes;
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
        System.out.println("Primes:");
        for (int i = 0; i < result.getSize(); i++) {
            System.out.print(result.get(i) + " ");
        }
        System.out.println(" ");
    }
}
