
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Mau beli kendaraan apa? ");
        System.out.println("1 untuk bicycle");
        System.out.println("2 untuk car");
        int pilihan = in.nextInt();

        if (pilihan == 1) {
            bicycle sepeda = new bicycle();
            System.out.println("Jumlah Roda : ");
            sepeda.numwheels = in.nextInt();
            System.out.println("Harga       : ");
            sepeda.price = in.nextDouble();
            System.out.println("Tipe Sepeda : ");
            sepeda.biketype = in.next();
            System.out.println("Apakah ada diskon ?(1/2)");
            int diskonya = in.nextInt();
            if (diskonya == 1) {
                System.out.println("Masukkan Diskon (%) : ");
                sepeda.discount = in.nextInt();
                System.out.println(">>>>>>Ini Data Sepeda<<<<<<");
                sepeda.print();
            } else if (diskonya == 2) {
                System.out.println(">>>>>Ini Data Sepeda<<<<<");
                sepeda.print();

            }

        } else if (pilihan == 2) {
            System.out.println("Convertible Atau Tidak (1/2)");
            int conv = in.nextInt();
            if (conv == 1) {
                convertible car = new convertible();
                System.out.println("Jumlah Roda  : ");
                car.numwheels = in.nextInt();
                System.out.println("Harga        : ");
                car.price = in.nextDouble();
                System.out.println("Jumlah Pintu : ");
                car.numDoor = in.nextInt();
                System.out.println("Apakah Elektrik? (true/false)");
                car.iselectric = in.nextBoolean();
                System.out.println("Jenis Atap   : ");
                car.roofType = in.next();
                System.out.println("Diskon Atau Tidak? (1/2)");
                int diskonya = in.nextInt();
                if (diskonya == 1) {
                    System.out.println("Masukkan Diskon (%) : ");
                    car.discount = in.nextInt();
                    System.out.println("---Ini Data Mobil---");
                    car.print();
                } else if (diskonya == 2) {
                    System.out.println("---Ini Data Mobil---");
                    car.print();

                }

            } else if (conv == 2) {
                car car = new car();
                System.out.println("Jumlah Roda  : ");
                car.numwheels = in.nextInt();
                System.out.println("Harga        : ");
                car.price = in.nextDouble();
                System.out.println("Jumlah Pintu : ");
                car.numDoor = in.nextInt();
                System.out.println("Apakah Elektrik? (true/false)");
                car.iselectric = in.nextBoolean();
                System.out.println("Diskon Atau Tidak? (1/2)");
                int diskonya = in.nextInt();
                if (diskonya == 1) {
                    System.out.println("Masukkan Diskon (%) : ");
                    car.discount = in.nextInt();
                    System.out.println("---Ini Data Mobil---");
                    car.print();
                } else if (diskonya == 2) {
                    System.out.println("---Ini Data Mobil---");
                    car.print();

                }

            }
        }
        in.close();
    }
}
