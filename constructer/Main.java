import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Idman programina Hosgeldiniz...");

            String idmanlar = "Gecerli Hareket...\n"+"Burpee\n"+"Pushup\n"+"Situp\n"+"Squat";
            System.out.println(idmanlar);

            System.out.println("Bir idman olusturun");

            System.out.println("Burpee Sayisi : ");
            int burpee = scanner.nextInt();
            System.out.println("Pushup Sayisi : ");
            int pushup = scanner.nextInt();
            System.out.println("Situp Sayisi : ");
            int situp = scanner.nextInt();
            System.out.println("Squat Sayisi : ");
            int squat = scanner.nextInt();
            scanner.nextLine();


            idman idman0 = new idman(burpee, pushup, situp, squat);

            System.out.println("Idmaniniz basliyor");

            while(idman0.idmanBittiMi() == false){
                System.out.println("Hareket Turu : ");
                String tur = scanner.nextLine();
                System.out.println("Bu hareketten kac tane yapacaksiniz");
                int sayi = scanner.nextInt();
                scanner.nextLine();
                idman0.hareketYap(tur, sayi);
            }
        }
    }
}