package TugasSesi9;

public class MahasiswaKu {
    public static void main(String[] args) {
        Mahasiswa <String,String, Integer> m = new Mahasiswa<>();
        m.setNim("20210040184");
        m.setNama("Rian Rizki Rajib");
        m.setClas(21);
        System.out.println(m.getNim());
        System.out.println(m.getNama());
        System.out.println(m.getClass());
    }
}