/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cottage;

import java.util.Scanner;

/**
 *
 * @author Neva
 */
public class Cottage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan kamar");
        String kamar = input.nextLine();
        System.out.println("Masukkan hari");
        String hari = input.nextLine();
        int harga = 0;
        System.out.println("Masukkan jumlah orang");
        int orang = input.nextInt();
        
    
        
        if (kamar.equals("Duku")) {
            if (orang<= 2) {
               if (hari.equals("Weekday")) {
                   harga = 915000;
               } else if (hari.equals("Weekend")) {
                   harga = 1025000;
               } else if (hari.equals("Holiday")) {
                   harga = 1225000;
               }
            }
        }
         
        if (kamar.equals("Jeruk")) {
            if (orang<= 2) {
                 if (hari.equals("Weekday")) {
                   harga = 915000;
               } else if (hari.equals("Weekend")) {
                   harga = 1025000;
               } else if (hari.equals("Holiday")) {
                   harga = 1225000;
               }
            }
        }
            
        if (kamar.equals("Alpukat")) {
            if (orang<= 2) {
              if (hari.equals("Weekday")) {
                   harga = 575000;
               } else if (hari.equals("Weekend")) {
                   harga = 695000;
               } else if (hari.equals("Holiday")) {
                   harga = 895000;
               }
            }
        }
        
        if (kamar.equals("Jambu Air")) {
            if (orang<= 2) {
             if (hari.equals("Weekday")) {
                   harga = 575000;
               } else if (hari.equals("Weekend")) {
                   harga = 695000;
               } else if (hari.equals("Holiday")) {
                   harga = 895000;
               }
            }
        }
        
        if (kamar.equals("Durian")) {
            if (orang<= 2) {
             if (hari.equals("Weekday")) {
                   harga = 595000;
               } else if (hari.equals("Weekend")) {
                   harga = 715000;
               } else if (hari.equals("Holiday")) {
                   harga = 915000;
               }
            }
        }
        
        if (kamar.equals("Melon")) {
            if (orang<= 2) {
             if (hari.equals("Weekday")) {
                   harga = 595000;
               } else if (hari.equals("Weekend")) {
                   harga = 715000;
               } else if (hari.equals("Holiday")) {
                   harga = 915000;
               }
            }
        }
        
         if (kamar.equals("Belimbing")) {
            if (orang<= 2) {
             if (hari.equals("Weekday")) {
                   harga = 495000;
               } else if (hari.equals("Weekend")) {
                   harga = 575000;
               } else if (hari.equals("Holiday")) {
                   harga = 755000;
               }
            }
        }
         
         if (kamar.equals("Mangga")) {
            if (orang<= 2) {
            if (hari.equals("Weekday")) {
                   harga = 495000;
               } else if (hari.equals("Weekend")) {
                   harga = 575000;
               } else if (hari.equals("Holiday")) {
                   harga = 755000;
               }
            }
        }
         
         if (kamar.equals("Kedondong")) {
            if (orang<= 2) {
            if (hari.equals("Weekday")) {
                   harga = 495000;
               } else if (hari.equals("Weekend")) {
                   harga = 575000;
               } else if (hari.equals("Holiday")) {
                   harga = 755000;
               }
            }
        }
         
         if (kamar.equals("Barrack")) {
            if (orang>= 0) {
            if (hari.equals("Weekday")) {
                   harga = 25000;
               } else if (hari.equals("Weekend")) {
                   harga = 25000;
               } else if (hari.equals("Holiday")) {
                   harga = 35000;
               }
            }
        }
         System.out.println("Harga " + harga);
    }
}