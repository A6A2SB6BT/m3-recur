public class Main {
    public static void main(String[] args) {
        showNumbers(5);
    }

    public static int NoSeQueFa(int a, int b) {
        if(b == 0) return 0;
        return a + NoSeQueFa(a, b-1);
    }

    public static int NoSeQueFaIter(int a, int b) {
        int sum = 0;
        for (int i = 0; i < b; i++) {
            sum += a;
        }

        return sum;
    }

    public static int SumaRecur(int n) {
        if (n == 0) return 0;
        return n + SumaRecur(n - 1);
    }

    public static void showNumbers(int n) {

    }

    public static void showNumbersInvers(int n) {
        System.out.print(n + " ");
        if(n == 1) return;
        showNumbers(n - 1);
    }
}