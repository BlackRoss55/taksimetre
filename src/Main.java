import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b=2.2, c=10;
        Scanner km = new Scanner(System.in);

        System.out.print("Taksimetre kilometresi giriniz :");
        a = km.nextDouble();
        c += a*b;

        c = (c < 20) ? 20 : c;
        System.out.print("Taksi ücreti: "+ c);

    }
}