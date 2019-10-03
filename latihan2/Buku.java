
package latihan2;


public class Buku{
    String namaPengarang;
    String judulBuku;
    int tahunTerbit;
    int cetakanKe;
    double hargaJual;
    
public Buku(String namaPengarang) {
    this.namaPengarang = namaPengarang ; 
}   
public Buku(String namaPengarang, String judulBuku) {
    this.namaPengarang = namaPengarang ;
    this.judulBuku = judulBuku ;
  
}
public Buku(String namaPengarang, String judulBuku, int tahunTerbit) {
    this.namaPengarang = namaPengarang ;
    this.judulBuku = judulBuku ; 
    this.tahunTerbit = tahunTerbit ;
}
public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe) {
    this.namaPengarang = namaPengarang ;
    this.judulBuku = judulBuku ; 
    this.tahunTerbit = tahunTerbit ;
    this.cetakanKe = cetakanKe;   
}
public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual) {
    this.namaPengarang = namaPengarang ;
    this.judulBuku = judulBuku ; 
    this.tahunTerbit = tahunTerbit ;
    this.cetakanKe = cetakanKe;
    this.hargaJual = hargaJual;
}
public void info() {
    System.out.println("\nNama Pengarang :" + this.namaPengarang + "\nJudul Buku :" + this.judulBuku + "\nTahun Terbit :" + this.tahunTerbit + "\nCetakan Ke :" + this.cetakanKe + "\nHarga Jual :" + this.hargaJual);
}

public static void main(String[] args){
    Buku satu = new Buku("Eza");
    Buku dua = new Buku("Eza", "Menyuruh Teman");
    Buku tiga = new Buku("Eza", "Menyuruh Teman", 1998);
    Buku empat = new Buku("Eza", "Menyuruh Teman", 1998, 3);
    Buku lima = new Buku("Eza", "Menyuruh Teman", 1998, 3, 200000);
    satu.info();
    dua.info();
    tiga.info();
    empat.info();
    lima.info();
}
}
