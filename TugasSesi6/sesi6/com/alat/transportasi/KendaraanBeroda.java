
package sesi6.com.alat.transportasi;


public abstract class KendaraanBeroda {
  String warna;
    
    String getWarna(){
        return warna;
    }
    
    void setWarna(String warna){
        this.warna = warna;
    }
    
    abstract float getLuas();
}   

