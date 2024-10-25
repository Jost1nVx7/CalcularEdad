/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package espoch.edu.ec.mavenproject3;

/**
 *
 * @author Global Technology Ec
 */
import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingresar su edad:");
        int edad = e.nextInt();

        if (edad >= 0 && edad < 120) {
            if (edad >= 0 && edad <= 12) {
                System.out.println("Eres un niño");
            } else if (edad >= 13 && edad <= 35) {
                System.out.println("Eres un joven");
            }else {
                System.out.println("Eres adulto");
            }
        } else {
            System.out.println("ERROR");

        }

    }
}
