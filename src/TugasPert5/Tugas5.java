package TugasPert5;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Tugas5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah baris: ");
        int n = Integer.parseInt(reader.readLine());

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
