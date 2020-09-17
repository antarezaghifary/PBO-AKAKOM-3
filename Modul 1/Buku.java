public class Buku{
    String judul;
    int harga;
    int halaman;
    String penerbit;
    int tahun_rilis;
    
    public void setBuku(String judul,int harga,int halaman,String penerbit,int tahun_rilis){
        this.judul=judul;
        this.harga=harga;
        this.halaman=halaman;
        this.penerbit=penerbit;
        this.tahun_rilis=tahun_rilis;
  }
      public void tampil(){
      System.out.println("Judulbuku :"+judul);
      System.out.println("Harga buku : "+harga);
      System.out.println("Jumlah halaman : "+halaman);
      System.out.println("Penerbit Buku :"+penerbit);
      System.out.println("Tahun Rilis :"+tahun_rilis);
                
        }
    }
