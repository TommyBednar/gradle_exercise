package sequence;

public class Sequence {

    public static int tri(int n) {
        return n*(n+1)/2;
    }

    public static int lazy(int n) {
        return tri(n) + 1;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("java Sequence <lazy|triangle> <int32>");
            System.exit(-1);
        }

        String seq = args[0];

        if (!seq.equals("lazy") && !seq.equals("tri")) {
            System.exit(1);
        }

        try {
            int n = Integer.parseInt(args[1]);
            if (seq.equals("lazy")) {
               System.out.printf("Lazy(%d) = %d%n", n, lazy(n));
            } else {
               System.out.printf("Tri(%d) = %d%n", n, tri(n));
            }
        } catch (Exception e) {
            System.exit(2);
        }

    }
}
