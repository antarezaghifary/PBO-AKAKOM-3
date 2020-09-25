public class Segitiga
{
  int alas;
  int tinggi;

  public void setSegitiga(int alas, int tinggi){
    this.alas = alas;
    this.tinggi = tinggi;
  }
  public int alas(){
    return alas;
  }
  public int tinggi(){
    return tinggi;
  }
  public int luasSegitiga(){
    int luas;
    luas =  (alas * tinggi)/2;
    return luas;
  }
public void tampil(){
    System.out.println("alas: "+alas);
    System.out.println("tinggi: "+tinggi);
    System.out.println("Luas: "+luasSegitiga());
  }
}