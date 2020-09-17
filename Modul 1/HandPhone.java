public class HandPhone{
    String pemilik;
    String no_hp;
    
    public void setHandphone(String pemilik,String no_hp){
        this.pemilik=pemilik;
        this.no_hp=no_hp;
  }
      public void tampil(){
      System.out.println("Nama Pemilik :"+pemilik);
      System.out.println("No. HP: "+no_hp);
              
      }
  }