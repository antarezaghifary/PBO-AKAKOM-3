class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");

    //Buku buku = new Buku();
    //buku.setBuku("hery",20000,23,"reza",2020);
    //buku.tampil();

    //Pegawai pegawai = new Pegawai();
    //pegawai.setPegawai("Reza","Malang");
    //pegawai.tampil();

    HandPhone handphone = new HandPhone();
    handphone.setHandphone("Reza","085335560130");
    handphone.tampil();

    //praktik 2
    /*Lingkaran a;
    a=new Lingkaran();
    a.setJari(10.00);
    a.tampil();*/

    //praktik 3
    int i;
    Lingkaran[] a;
    a=new Lingkaran[5];
    for(i=0;i<5;i++)
    {
    a[i]=new Lingkaran();
    }
    a[0].setJari(00.00);
    a[1].setJari(10.00);
    a[2].setJari(20.00);
    a[3].setJari(30.00);
    a[4].setJari(40.00);
    for(i=0;i<5;i++)
    {
    System.out.println("Lingkaran ke: "+i);
    a[i].tampil();
    }
  }
}