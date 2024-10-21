import java.util.Scanner;
public class FungsiNilai {
    
    public static String konversi(int nilai) {
        if (nilai >= 85) {
            return "A";
        } else if (nilai >= 75) {
            return "B";
        } else if (nilai >= 65) {
            return "C";
        } else if (nilai >= 50) {
            return "D";
        } else {
            return "E";
        }
    }
    public static void InputNilai(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan Nilai: ");
        int nilai = sc.nextInt();
        String grade = konversi(nilai);
        System.out.println("Nilai: "+ nilai +  ", Grade: " +grade);
    
}
public static void inputNilai() {
  
    String[] namaMatakuliah = MataKuliah.getnamaMatakuliah();

    Scanner scanner = new Scanner(System.in); 

    for (int i = 0; i < namaMatakuliah.length; i++) {
        System.out.print("Masukkan nilai untuk " + namaMatakuliah[i] + ": ");
        int nilai = scanner.nextInt(); 
        String grade = FungsiNilai.konversi(nilai);  
        System.out.println("Mata kuliah: " + namaMatakuliah[i] + ", Nilai: " + nilai + ", Grade: " + grade);

        
    }

    scanner.close();  
}
}