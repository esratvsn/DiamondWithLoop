import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
      int n;
        System.out.print("Elmasın çapı kaç olsun: ");
        n=input.nextInt();

        // Üst üçgen kısmı
        for (int i = 1; i <= n; i++) {
            // Boşlukları yazdır
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alt üçgen kısmı
        for (int i = n - 1; i >= 1; i--) {
            // Boşlukları yazdır
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//     *              1    5    1           ***********   0    11
//    ***             2    4    3            *********    1    9
//   *****            3    3    5             *******     2    7
//  *******           4    2    7              *****      3    5
// *********          5    1    9               ***       4    3
//***********         6    0    11               *        5    1
//     n=6            i   n-i   2i-1            n=6