public class Task2 {
    public static void main(String[] args) {
        findRoots(2, 4, -8);
    }

    static void findRoots(double a, double b, double c) {
        double d = b * b - 4 * a * c;
        if (d > 0) {
            System.out.println((-b + Math.sqrt(d)) / (2 * a) + " и " + (-b - Math.sqrt(d)) / (2 * a));
        } else if (d == 0) {
            System.out.println(-b / (2 * a));
        } else {
            System.out.println("Корней нет");
        }
    }
}