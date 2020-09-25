class NilaiPangkat {
  int nilai;
  int pangkat;
  
  public void setPangkat(int nilai, int pangkat){
    this.nilai=nilai;
    this.pangkat=pangkat;
  }


   public int nilai(){
    return nilai;
  }
  public int pangkat(){
    return pangkat;
  }
  public double nilaiPangkat(){
    double hasil;
    hasil =  Math.pow(nilai, pangkat);
    return hasil;
  }

  public void tampil(){
    System.out.println("nilai: "+nilai);
    System.out.println("pangkat: "+pangkat);
    System.out.println("hasil: "+nilaiPangkat());
  }
}