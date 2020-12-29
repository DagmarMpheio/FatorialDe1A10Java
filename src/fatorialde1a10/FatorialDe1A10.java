/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fatorialde1a10;

/**
 *
 * @author dagma
 */
public class FatorialDe1A10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=1,fat=1;
        System.out.println("Fatorial de 1 a 10: \n");
        for(;i<=10;i++)
        {
            fat=fat*i;
            System.out.println(fat);
        }
    }
    
}
