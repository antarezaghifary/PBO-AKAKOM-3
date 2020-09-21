class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");

    /*Buku buku = new Buku();
    buku.setBuku("hery",20000,23,"reza",2020);
    buku.tampil();

    Pegawai pegawai = new Pegawai();
    pegawai.setPegawai("Reza","Malang");
    pegawai.tampil();*/

    /*HandPhone handphone = new HandPhone();
    handphone.setHandphone("Reza","085335560130");
    handphone.tampil();*/

    //praktik 2
    /*Lingkaran a;
    a=new Lingkaran();
    a.setJari(10.00);
    a.tampil();*/

    //praktik 3
    /*int i;
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
    }*/

    /*Persegi p;
    p=new Persegi();
    p.setPersegiPanjang(10,5);
    p.tampil();

    Mahasiswa mhs = new Mahasiswa();
    mhs.setMhs("nama", 195611070, "prodi", "alamat", "nomer_hp");
    mhs.tampil();*/

    /*Buku buku = new Buku();
    buku.setBuku("hery",20000,23,"reza",2020,13,"Bahasa Indonesia");
    buku.tampil();*/

    // System.out.format("%16s%10d%16s", "string1", 23, "string2");

    // String format = "|%1$-10s|%2$-10s|%3$-20s|\n";
    // System.out.format(format, "A", "AA", "AAA");
    // System.out.format(format, "B", "", "BBBBB");
    // System.out.format(format, "C", "CCCCC", "CCCCCCCC");

    // String ex[] = { "E", "EEEEEEEEEE", "E" };

    // System.out.format(String.format(format, (Object[]) ex)); 


/*Object[][] table = new String[4][];
table[0] = new String[] { "nomor Plat", "AB 3313 SY", "AB 1234 AT" };
table[1] = new String[] { "Warna", "Biru", "Merah" };
table[2] = new String[] { "Manufaktur", "Mitsubishi", "Toyota" };
table[3] = new String[] { "Kecepatan", "50 km/h", "100 km/h" };
String var ="Instan Variabel";
System.out.format("%-15s%-15s%-15s\n", "Kelas Mobil", "Objek Mobil A", "Objek Mobil B");
for (int i = 0; i < table.length; i++) {
    Object[] row = table[i];
    System.out.format("%-15d%-15s%-15s%-15s\n", i, row[0], row[1], row[2]);
    } 

    System.out.format("%-20s%-15s%-15s\n", "Instan Metode", "method akselerasi", "");
    System.out.format("%-20s%-15s%-15s\n", "", "method belok", "");
    System.out.format("%-20s%-15s%-15s\n", "", "method rem", "");*/


    //
System.out.format("%-30s%-15s%-15s\n", "Kelas Mobil     ", " Objek Mobil A", " Objek Mobil B");
System.out.format("%-15s%-15s%-15s%-15s\n", "Instan Variabel.", " nomor Plat", "AB 3313 SY", "AB 1234 AT");
System.out.format("%-15s%-15s%-15s%-15s\n", "", "  nomor Plat", " AB 3313 SY", " AB 1234 AT");
System.out.format("%-15s%-15s%-15s%-15s\n", "", "  nomor Plat", " AB 3313 SY", " AB 1234 AT");
System.out.format("%-15s%-15s%-15s%-15s\n", "", "  nomor Plat", " AB 3313 SY", " AB 1234 AT");

System.out.format("%-20s%-15s%-15s\n", "Instan Metode", "method akselerasi", "");
    System.out.format("%-20s%-15s%-15s\n", "", "method belok", "");
    System.out.format("%-20s%-15s%-15s\n", "", "method rem", "");

  }
}