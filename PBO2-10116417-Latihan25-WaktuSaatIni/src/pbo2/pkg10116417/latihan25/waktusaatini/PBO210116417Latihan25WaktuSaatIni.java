/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan25.waktusaatini;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author Akmal
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM WAKTU SAAT INI
 */
public class PBO210116417Latihan25WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date Waktu = new Date ( );
    SimpleDateFormat FormatWaktu = new SimpleDateFormat("EEEE, dd MMM yyy "
            + "hh:mm:ss");
        
        System.out.println("Hari ini adalah hari : " + FormatWaktu.format
        (Waktu));
        System.out.println("Devoloped by  Gilang Panji Waneng Pati");
    }
    
}
