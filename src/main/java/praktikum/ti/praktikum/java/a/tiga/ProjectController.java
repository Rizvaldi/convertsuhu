/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.ti.praktikum.java.a.tiga;

import praktikum.ti.praktikum.java.a.tiga.PemrosesanClass;  
import Service.Project.ServiceAccess;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author MSI 65 SERIES
 */
@Controller
public class ProjectController {
    PemrosesanClass proses = new PemrosesanClass();
    
    @RequestMapping("/salam")
    @ResponseBody
    public String greeting(){
        String kalimat = proses.ucapanSalam();
        
        
        return kalimat;
    }
    
    @RequestMapping("/viewdata")
    @ResponseBody
    public String tampilkan(){
        String result = "";
        
        //nim dan nama
        result = proses.tampilkanhasil("20200140089", "Axelindra");
        
        return result;
    }
    @RequestMapping("/prosesharga")
    @ResponseBody
    public String tampilHarga(){
        String harga ="";
        //jumlah beli dan harga satuan = total harga?
       
        harga =String.valueOf(proses.getHarga(150, 2000)); //convert double ke string
        
        
        return "Total Harga Bayar = " + harga;
    }
    
    @RequestMapping("/suhu")
    @ResponseBody
    public String getsuhu(){
        String suhu = "";
        // pilihan pada parameter kedua dapat berupa "F","K","R:
        suhu = String.valueOf(proses.suhuCelcius(100,"f"));
        return suhu;
    }
    
    ServiceAccess serv = new ServiceAccess();
    
    @RequestMapping("/ceknama")
    @ResponseBody
    public String viewName(){
        String result ="";
        
        result = serv.cekNama();
        
        
        return result;
    }
    
    @RequestMapping("/cekumur")
    @ResponseBody
    public String viewUmur(){
        String age = "";
        
        age = String.valueOf(serv.umur());
        
        return "Umur kamu Sekarang Adalah : " + age + " Tahun ";//String.valueOf(serv.umur());
    }
    
    
    @RequestMapping("/ceknamaumur")
    @ResponseBody
    public String viewNama(){
        String usia="";
        
        usia = String.valueOf(serv.umur());
        
        return "Nama : " +serv.cekNama() + "<br>" + "Umur : " + usia + " Tahun ";
    }
    @RequestMapping("/cekdata")
    @ResponseBody
    public String viewData(){
        String view = "";
        String umur = String.valueOf(serv.umur());
        
        view = "Nama : " + String.valueOf(serv.cekNama())+ "<br>Umur : "+ umur + "<br>Status : " + String.valueOf(serv.cekStatus());
        
        return view;
    }
}
