package inheritance;

import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Programa Hosgeldiniz");

        String islemler = "Islemler...\n"
                          + "1. Yazilim Islemleri\n"
                          + "2. Yonetici Islemleri\n"
                          + "Cikis icin q'ya basin";
        
        System.out.println("----------------------------------");
        System.out.println(islemler);
        System.out.println("----------------------------------");

        while(true){
            System.out.println("Islemi Seciniz");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Cikiliyor");
                break;
            }

            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Baray", "Ozturk", 126, "Java, Python, C#");
                String yazilimci_islem = "1. Format At\n"
                                        +"2. Bilgileri Goster\n"
                                        +"Cikis icin q'ya basin..";
                System.out.println(yazilimci_islem);
                while(true){
                    System.out.println("Islem Seciniz : ");
                    String y_islem= scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yazilimci Islemlerinden Cikiliyor...");
                        break;
                    }

                    else if (y_islem.equals("1")) {
                        System.out.println("Isletim sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAT(isletim_sistemi);
                    }

                    else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }

                    else{
                        System.out.println("Gecersiz islem");
                    }
                }
            }

            else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Ali", "Ozturk", 52, 10);

                String yonetici_islem = "Yonetici islemleri\n"
                                        +"1. Zam Yap\n"
                                        +"2. Bilgileri Goster\n"
                                        +"Cikis icin q'ya basin..";

                System.out.println(yonetici_islem);

                while(true){
                    System.out.println("Islem Seciniz...");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yonetici islemlerinden cikiliyor....");
                        break;
                    }
                    else if (y_islem.equals("1")) {
                        System.out.println("Yoneticinin ne kadar zam yapmasini istiyorsunu : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }

                    else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }

                    else{
                        System.out.println("gecersiz yonetici islemi...1");
                    }

                }
            }

            else{
                System.out.println("Gecersiz Islem");
            }
        }
    }

}
}