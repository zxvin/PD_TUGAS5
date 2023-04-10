package LatLooping;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LatihanNestedFor {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        //variable

//        int minggu, hari;
//
//        //input
//        System.out.println("Jumlah Minggu : ");
//        minggu = Integer.parseInt(br.readLine());
//        System.out.println("Jumlah Hari : ");
//        hari = Integer.parseInt(br.readLine());
//
//        //perulangan + output
//        //outer loop : baris
//        for (int i = 1; i <= minggu ; i++) {
//            System.out.println("Minggu Ke - " + i);
//
//            //inner loop : kolom
//            for (int j = 1; j <= hari ; j++) {
//                //jika ingin tidak menampilkan hari pada minggu tertentu gunakan command break
//                if (i==4){
//                    break;
//                }
//                System.out.println("Hari : " + j);

                //pattern
        int n = 5; // jumlah baris
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }




            System.out.println();

                }
        //pattern segitiga sikusiku terbalik dengan inputan user


            }
        }


