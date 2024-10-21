
import java.util.Scanner;
public class Mahasiswa {

    private String Nama;
    private String Kelas;
    private String Alamat;
    private int umur;
   


    public void tambahdata(){
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Masukan Nama?");
        Nama = sc.nextLine();

        System.out.println(("Masukan Kelas?"));
        Kelas = sc.nextLine();

        System.out.println("Masukan Alamat?");
        Alamat = sc.nextLine();

        System.out.println("masukan Umur?");
        umur = sc.nextInt();
        sc.nextLine();

        System.out.println(" nama :" + Nama);
        System.out.println("Kelas: "+ Kelas);
        System.out.println("Alamat: " + Alamat);
        System.out.println("umur: "+ umur);
        String[] namaMatakuliah = MataKuliah.getnamaMatakuliah();
        System.out.println("Nama Matkul : " + namaMatakuliah+ " grade : " + nilai );
    }
   
    public String Nama(){
        return Nama;
    }
    public String Kelas(){
        return Kelas;
    }
    public String Alamat(){
        return Alamat;
    }
    public int umur(){
        return umur;
    }
  
}