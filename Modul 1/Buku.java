public class Buku{
    String judul;
    int harga;
    int halaman;
    String penerbit;
    int tahun_rilis;
    //
    int untuk_umur;
    String bahasa;
    
    public void setBuku(String judul,int harga,int halaman,String penerbit,int tahun_rilis,int untuk_umur,String bahasa){
        this.judul=judul;
        this.harga=harga;
        this.halaman=halaman;
        this.penerbit=penerbit;
        this.tahun_rilis=tahun_rilis;
        this.untuk_umur = untuk_umur;
        this.bahasa = bahasa;
  }
      public void tampil(){
      System.out.println("Judulbuku :"+judul);
      System.out.println("Harga buku : "+harga);
      System.out.println("Jumlah halaman : "+halaman);
      System.out.println("Penerbit Buku :"+penerbit);
      System.out.println("Tahun Rilis :"+tahun_rilis);
      System.out.println("Buku ini untuk umur :"+untuk_umur);
      System.out.println("Bahasa yang digunakan :"+bahasa);
                
        }
    }
