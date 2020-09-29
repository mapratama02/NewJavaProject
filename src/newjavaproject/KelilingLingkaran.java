/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newjavaproject;

import java.util.Scanner;

/**
 *
 * @author Muhammad Anugrah Pratama
 */
public class KelilingLingkaran {
    private static final double phi = Math.PI;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jari_jari;
        
        System.out.println("Menghitung Keliling Lingkaran \n");
        System.out.print("Jari-jari: ");
        jari_jari = input.nextDouble();
        
        System.out.println("\nKelilingnya: " + hitungLuas(jari_jari, phi));
    }
    
    public static double hitungLuas(double jari_jari, double phi){
        return 2 * phi * jari_jari;
    }
}
