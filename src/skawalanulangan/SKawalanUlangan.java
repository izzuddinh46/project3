/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skawalanulangan;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class SKawalanUlangan {
    public static void main(String[] args) {
       int nom1 = ( int )(Math.random()*101);
       int nom2 = ( int )(Math.random()*101);
       
       Scanner input = new Scanner(System.in);
       System.out.println("Nyatakan jawapan " + nom1 + "+" + nom2 + "= ");
       int jawapan = input.nextInt();
       
       while (nom1 + nom2 != jawapan){
           System.out.print("jawapan anda salah! Sila cuba lagi...\n Nyatakan jawapan"
                   + nom1 + "+" + nom2 + "= ");
           jawapan = input.nextInt();
       }
       
       System.out.println("Tahniah,jawpan anda betul!" );
        // TODO code application logic here
    }
    
}
