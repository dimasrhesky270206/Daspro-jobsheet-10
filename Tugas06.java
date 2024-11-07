import java.util.Scanner;

public class Tugas06 {
    public static void main(String[] args) {
        // Langkah 1: Inisialisasi Scanner dan array
        Scanner input = new Scanner(System.in);
        int[][] a = new int[10][6];
        int sementara = 0;
        double rata; 

        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Input nilai untuk a[" + i + "][" + j + "]: ");
                a[i][j] = input.nextInt(); 
            }
        }

        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                sementara += a[i][j]; 
            }
        }

        
        rata = (double) sementara / (10 * 6); 

        
        System.out.println("Rata-rata nilai: " + rata); 

        // Menutup scanner
        input.close(); 
    }
}