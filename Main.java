import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jam : ");
        int jam = input.nextInt();
        System.out.println("Menit : ");
        int mnt = input.nextInt();
        System.out.println("detik : ");
        int dtk = input.nextInt();


        waktu time = new waktu(jam, mnt, dtk);
        System.out.println("Waktu : " + time.jam + ":" + time.menit + ":" + time.detik);

        System.out.println("Hasil konversi " + time.hasil());
    }
}