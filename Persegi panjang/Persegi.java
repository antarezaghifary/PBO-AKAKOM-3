public class Persegi
{
  int panjang;
  int lebar;

  public void setPersegiPanjang(int panjang, int lebar){
    this.panjang = panjang;
    this.lebar = lebar;
  }
  public int panjang(){
    return panjang;
  }
  public int lebar(){
    return lebar;
  }
  public int luasPersegiPanjang(){
    int luas;
    luas = panjang * lebar;
    return luas;
  }

  public int kelPersegiPanjang(){
    int kel;
    kel = 2*(panjang+lebar);
    return kel;
  }
  public void tampil(){
    System.out.println("panjang: "+panjang);
    System.out.println("lebar: "+lebar);
    System.out.println("Luas: "+luasPersegiPanjang());
    System.out.println("Keliling: "+kelPersegiPanjang());
  }
}
