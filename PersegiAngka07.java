import java.util.Scanner;

public class PersegiAngka07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N < 3) {
            System.out.println("Nilai N minimal 3.");
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                
                if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                    System.out.printf("%d ", N);  
                } else {
                    System.out.printf("  ");  
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
