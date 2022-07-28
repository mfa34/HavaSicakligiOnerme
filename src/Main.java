import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat ;

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen hava sicakligini giriniz .");
        heat = input.nextInt();

        if (heat < 5 ){
            System.out.println("kayak yapmayi deneyebilirsin.");
        } else if ( 5<heat || heat <=15  ) {
            System.out.println("Sinemaya gitmelisin.");
        } else if (15<heat || heat <=25 ) {
            System.out.println("piknik ' e gidebilirsin.");
        } else if ( 25<heat) {
            System.out.println("Yuzmeye gidebilirsin.");
        }
    }
}
