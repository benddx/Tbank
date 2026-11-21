public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (isValid(i)) System.out.print(i + " ");
        }
    }

    static boolean isValid(int n) {
        int orig = n, rev = 0, sum = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            sum += digit;
            n /= 10;
        }
        return orig == rev && sum > 10;

    }
}