package hawariprogramer;

import java.util.ArrayList;
import java.util.Scanner;

public class mainApp {
    public static void main(String[] args) {
       String nim = null,nama,alamat,ulang;
       boolean x =true;
       Scanner input = new Scanner(System.in);
  
        do {
        ArrayList<mahasiswa> data = new ArrayList<>();
        mahasiswa objectMahasiswa = new mahasiswa();
        System.out.println("masukan nim anda    :");
        nim = input.next();
        System.out.println("masukan nama anda   :");
        nama = input.next();
        System.out.println("masukan alamat anda :");
        alamat = input.next();
        objectMahasiswa.setNim(nim);
        objectMahasiswa.setNama(nama);
        objectMahasiswa.setAlamat(alamat);
        data.add(objectMahasiswa);
        
        System.out.println("nim:\t\tnama:\t\talamat:");
        
     
        System.out.print(data.get(0).getNim());    
        System.out.print("\t"+data.get(0).getNama());    
        System.out.println("\t\t"+data.get(0).getAlamat());    
        
            System.out.println("APALAH ANDA INGIN MEMASUKAN DATA LAGI ?(y/n)");
            ulang = input.next();
            if(ulang.equalsIgnoreCase("n"))
                x = false;
        
        } while (x==true);
        
           System.out.println("===== PROGRAM SELESAI ===== ");
        
           
    
        
     }
   }
 
        
            
        
   
                    
         
    

     
         
    
    
