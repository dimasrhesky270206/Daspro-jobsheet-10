public class Bioskop06 {
    public static void main(String[] args) {
        // Membuat array 4x2
        String[][] penonton = new String[4][2];

        // Mengisi array dengan nama penonton
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel"; 
        penonton[3][1] = "Hana "; 

        
        System.out.println("Penonton pada baris ke-3: ");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(",", penonton[i]));
        }
    }
}