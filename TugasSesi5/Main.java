/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasSesi5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nama Dosen : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Alamat Dosen : ");

        String alamat = sc.nextLine();

        Dosen dosen1 = new Dosen();

        for(int i = 0; i < 3; i++){
            System.out.print("Masukkan mata kuliah yang dipelajari : ");
            String matkul = sc.nextLine();
            dosen1.addCourse(matkul);
        }

        System.out.println(dosen1);

    }
}