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
public class LuasLingkaran {
    private static final double phi = 22/7;
    
    public static void main(String[] args) {
        double jari_jari;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Menghitung Luas Lingkaran \n");        
        System.out.print("Jari-jari: ");
        jari_jari = input.nextDouble();
        
        System.out.println("\nLuasnya: " + hitungKeliling(jari_jari, phi));
    }
    
    public static double hitungKeliling(double jari_jari, double phi){
        return phi * (jari_jari * jari_jari);
    }
}
