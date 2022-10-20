/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

import java.util.Scanner;

public class Soal2 {
    public static void main(String[]args){
        
        int t, s, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jumlah Baris: ");
        int tinggi = input.nextInt();
        
        for(t=0; t<=tinggi; t++){

            for(s=1; s<=t; s++){   
                System.out.print(" ");
            }
            for(b=1; b<=tinggi-t; b++){
                System.out.print(" #");
            }
            
            System.out.println();
        }
        for(t=1; t<=tinggi; t++){

            for(s=1; s<=tinggi-t; s++){   
                System.out.print(" ");
            }
            for(b=1; b<=t; b++){
                System.out.print(" *");
            }
            
            System.out.println();
        }
    }
}

