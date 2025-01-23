import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String shape = scanner.nextLine();
        double a, b, c, r;
        double area = 0;

        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                area = triangleArea(a,b,c);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = rectangleArea(a,b);
                break;
            case "circle":
                r = scanner.nextDouble();
                area = circleArea(r);
                break;
            default:
                System.out.println("Invalid shape");
                break;
        }

        System.out.println(area);
    }

    public static double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }

    public static double rectangleArea(double a, double b) {
        return a * b;
    }

    public static double circleArea(double r) {
        return 3.14 * (r * r);
    }
}