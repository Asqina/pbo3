import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] nama = new String[50];
        String[][] matkul = new String[50][50];
        String[] jenis = new String[50];

        int jmlh_mhs;
        int[] jmlh_matkul = new int[50];
        Scanner input = new Scanner(System.in);
        System.out.println("\t\t\tProgram input mata kuliah");
        System.out.println("-------------------------------------");
        //System.out.println("Program input mata kuliah");

        System.out.print("Jumlah mahasiswa : ");
        jmlh_mhs = input.nextInt();
        for (int i = 0; i < jmlh_mhs; i++) {
            System.out.println("Mahasiswa " + (i+1));
            System.out.print("Masukan nama : ");
            nama[i] = input.next();

            System.out.println("Jenis kelamin : ");
            System.out.println("1. Perempuan");
            System.out.println("2. Laki-laki");
            System.out.print("Masukan jenis kelamin (1/2) : ");
            int jk = input.nextInt();

            if (jk == 1) {
                jenis[i] = "Perempuan";
            } else if (jk == 2) {
                jenis[i] = "Laki-laki";
            } else {
                System.out.println("Pilihan tidak ada ");
                //goto pilih;
            }
            int j = 0;
            System.out.print("Jumlah matakuliah yang diambil ");
            jmlh_matkul[i] = input.nextInt();
            while (j < jmlh_matkul[i]) {
                System.out.print("Mata kuliah ke-" +  (j+1) + " :");
                matkul[i][j] = input.next();
                j++;
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("Hasil inputan\n");
        for( int i=0; i<jmlh_mhs; i++){
            int  j=0;
            System.out.println("Mahasiswa " + (1+i));
            System.out.println("Nama\t\t\t: " + nama[i]);
            System.out.println("Jenis  Kelamin\t: " + jenis[i]);
            System.out.println("Mata kuliah  ");
            do{
               System.out.println("Matkul " + (j+1) + "\t\t: " + matkul[i][j]);
               j++;
            }
            while (j<jmlh_matkul[i]);
        System.out.println();
        }
    }
    /*
1. main program
2. variable
3. tipe data
4. for
5.if
6.while					
7. do while
8. array 1 dimensi
9 array 2 dimensi
10. input
11. output
12, komen
*/
}
