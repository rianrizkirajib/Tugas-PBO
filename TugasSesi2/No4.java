package TugasSesi2;
import java.util.Set;

public class No4 {
    String jenis_hp;
    int tahun_pembuatan;
    
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    public String getJenisHP(){
        return jenis_hp;
    }
    
    public int getTahunPembuatan(){
        return tahun_pembuatan;
    }
    
    public static void main(String[] args){
        No4 hp = new No4();
        hp.setDataHP("Apple 14 Pro", 2022);
        System.out.println("Jenis Handphone : " +hp.jenis_hp);
        System.out.println("Tahun Pembuatan : " +hp.getTahunPembuatan());
    }
}