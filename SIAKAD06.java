import java.util.Scanner;

public class SIAKAD06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] nilai = new int[4][3]; 

        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
            }
        }

        
        for (int i = 0; i < nilai.length; i++) {
            int total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j]; 
            }
            double rataRata = (double) total / nilai[i].length; 
            System.out.printf("Rata-rata nilai mahasiswa ke-%d: %.2f%n", (i + 1), rataRata); 
        }

        sc.close(); 
    }
}