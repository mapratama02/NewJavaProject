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
public class LuasPersegiPanjang {
    public static void main(String[] args) {
        double p, l;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menghitung Luas Persegi Panjang\n");
        System.out.print("Panjang: ");
        p = input.nextDouble();
        System.out.print("Lebar: ");
        l = input.nextDouble();
        
        System.out.println("Luasnya: " + hitungLuas(p, l));
    }
    
    public static double hitungLuas(double p, double l){
        return p * l;
    }
}
