/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.Project;

/**
 *
 * @author MSI 65 SERIES
 */
public class ServiceAccess {
      
    public String cekNama(){
        return "Rizvaldi Firnanndasyah";
    }
    
    public int umur(){
        
        int umurSekarang=0;
        
        
        int Tahunlahir = 2002;
        int TahunSekarang= 2021;
        
        umurSekarang = TahunSekarang - Tahunlahir;
        
        return umurSekarang;
    }
    
    public String cekStatus(){
        String status ="";
        int usia = umur();
        
        if(usia >= 17){
            status = "Memiliki KTP";
        }else{
            status = "Tidak punya KTP";
        }
        return status;
    }
}
