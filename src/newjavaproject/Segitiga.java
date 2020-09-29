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
public class Segitiga {
    
    public static void main(String[] args) {
        double alas, tinggi;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung Luas Segitiga \n");        
        System.out.print("Tinggi: ");
        tinggi = input.nextDouble();
        System.out.print("Alas: ");
        alas = input.nextDouble();
        
        System.out.println("\nLuasnya: " + hitungLuas(tinggi, alas));
    }
    
    public static double hitungLuas(double tinggi, double alas){
        return (alas * tinggi) / 2;
    }
}
