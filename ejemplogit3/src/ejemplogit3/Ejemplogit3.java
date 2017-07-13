/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogit3;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Ejemplogit3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombre = lector.next();
        System.out.println("hola " + nombre);
    }
    
}
