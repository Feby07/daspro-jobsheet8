import java.util.Scanner;

public class PersegiAngka07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i,j,N;

        System.out.print("Masukkan nilai N (Minimal 3): ");
        N = sc.nextInt();

        if (N < 3) {
            System.out.print("Nilai harus minimal 3");
        } 

        for (i=1; i<=N; i++) {
            for (j=1; j<=N; j++) {
                if (i == 1 || i == N || j == 1 || j == N || (i == j && i !=1 && i !=N)) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        
    }
}
