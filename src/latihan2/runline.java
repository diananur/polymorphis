/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

/**
 *
 * @author Lenovo
 */
public class runline {
       public static void main(String []args){
       //membuat 2 objek
       line line = new line(1,2,3,4);
       line line2 = new line(5,6,7,8);
       //length objek 1 dan 2
       System.out.println("Panjang Angka Objek 1 = "+line.getLength());
       System.out.println("Panjang Angka Objek 2 = "+line2.getLength());
       System.out.println("");
       //perbandingan
       System.out.println("Perbandingan Objek 1 > Objek 2 = "+line.isGreater(line, line2));
       System.out.println("Perbandingan Objek 1 < Objek 2 = "+line.isLess(line, line2));
       System.out.println("Perbandingan Objek 1 = Objek 2 = "+line.isEqual(line, line2));
       }
}
