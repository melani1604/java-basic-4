//import library Scanner
import java.util.Scanner; 
public class JavaMethod {
    public static void main(String[] args){
    

    Scanner input = new Scanner(System.in);;

    System.out.println("======================================");
    System.out.println("Rentang nilai " + "\n");
    System.out.println("A" + " : " + "81 - 100" + "\n" +
                        "B" + " : " + "61 - 80" + "\n" +
                        "C" + " : " + "41 - 60" + "\n" +
                        "D" + " : " + "21 - 40" + "\n" +
                        "E" + " : " + "0 - 20" + "\n");
    
    System.out.println("Hello Melani, Silahkan input nilai kamu : ");
    int angka = input.nextInt();
    
     // manggil fungsi Grade
    Grade(angka);
    System.out.println("======================================");
    }

    static void Grade(int angka) {
        String pesan;
        // Cek kondisi yang ditetapkan
        if(angka >= 0 && angka <= 20){
        pesan = angka + " maka Grade E, berusaha belajar labih giat lagi yaa!";
        }else if(angka >= 21 && angka <= 40){
        pesan = angka + " maka Grade D, yuk lebih semangat lagi ya belajarnya";
        }else if (angka >= 41 && angka <= 60){
        pesan = angka + " maka Grade C, cukup bagus kok nilainya";
        }else if (angka >= 61 && angka <= 80){
        pesan = angka + " maka Grade B, bagus hebat nilainya";
        }else if (angka >= 81 && angka <= 100){
        pesan = angka + " maka Grade A, nilai kamu bagus banget pertahanin yaa";
        }else {
        pesan = "Nilai yang kamu input tidak valid";
        }
    
    System.out.println("Nilai Kamu adalah " + pesan);
    }
}