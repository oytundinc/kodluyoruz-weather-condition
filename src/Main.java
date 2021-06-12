import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        double weatherHeat = input.nextDouble();

        if (weatherHeat < 5) {
            System.out.println("Kayak yapmaya uygun.");
        } else if (weatherHeat >= 5 && weatherHeat <=25) {
            if (weatherHeat >= 5 && weatherHeat < 10) {
                System.out.println("Sinemaya gidebilirsiniz.");
            } else if (weatherHeat >= 10 && weatherHeat <=15) {
                System.out.println("Sinemaya gidebilirsiniz.");
                System.out.println("Piknik yapabilirsiniz.");
            } else {
                System.out.println("Piknik yapabilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
