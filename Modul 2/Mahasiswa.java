public class Mahasiswa{
    String nama;
    int nim;
    String prodi;
    String alamat;
    String nomer_hp;
    
    public void setMhs(String nama,int nim,String prodi,String alamat,String nomer_hp){
        this.nama=nama;
        this.nim=nim;
        this.prodi=prodi;
        this.alamat=alamat;
        this.nomer_hp=nomer_hp;
  }
      public void tampil(){
      System.out.println("nama MHS :"+nama);
      System.out.println("nim MHS : "+nim);
      System.out.println("prodi MHS : "+prodi);
      System.out.println("alamat MHS :"+alamat);
      System.out.println("nomer_hp MHS :"+nomer_hp);
                
        }
    }
