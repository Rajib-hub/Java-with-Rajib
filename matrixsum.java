import java.util.Scanner;

public class matrixsum {
    public static void main(String[] args) {
        int[][] flats1;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        flats1 = new int[m][n];
        for (int i = 0; i < flats1.length; i++) {
            for (int j = 0; j < flats1[0].length; j++) {
                flats1[i][j] = sc.nextInt();
            }
            // System.out.println(" ");
        }
        for (int i = 0; i < flats1.length; i++) {
            for (int j = 0; j < flats1[0].length; j++) {
                System.out.print(flats1[i][j]);
                System.out.print("\t");
            }
            System.out.println(" ");
        }
        int[][] flats2;
        // Scanner sc=new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        flats2 = new int[k][l];
        for (int o = 0; o < flats2.length; o++) {
            for (int p = 0; p < flats2[0].length; p++) {
            }
            // System.out.println(" ");
        }
        for (int o = 0; o < flats2.length; o++) {
            for (int p = 0; p < flats2[0].length; p++) {
                System.out.print(flats2[o][p]);
                System.out.print("\t");
            }
            System.out.println(" ");
        }
        int [][]flats3=new int[2][2];
        for(int q=0;q<flats3.length;q++){
             for(int w=0;w<flats3[0].length;w++){
                System.out.println("summation of two matrix:");
                flats3[2][2]=flats1[q][w]+flats2[q][w];
             }
        }

    }
}

