/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5;

/**
 *
 * @author Windows 10
 */
public class Operatorbtwise {
    public static void main(String[] args) {
        int x = 12;
        int y = 20;
        int z;
        
        z = x | y;
        System.out.println("Hasil operasi bbwise OR:"+z);
        z = x & y;
        System.out.println("Hasil operasi btwise AND:"+z);
        z = x ^ y;
        System.out.println("Hasil operasi btwise XOR:"+z);
        z = ~x;
        System.out.println("Hasil operasi btwise NOT:"+z);
        z = x << 3;
        System.out.println("Hasil operasi btwise shift left:"+z);
        z = y >> 2;
        System.out.println("Hasil operasi btwise shift right:"+z);
        
    }
    
}
    

