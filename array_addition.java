public class array_addition {
    public static void main(String[] args) {
        int i, j, a1[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 5 }, { 2, 6, 4, 8, 9 } },
                a2[][] = { { 1, 9, 4, 7, 6 }, { 8, 5, 4, 7, 3 }, { 4, 6, 5, 6, 4 } }, a3[][] = new int[3][5];
        System.out.println("The elements of a1 are:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.println(a1[i][j]);
            }

        }
        System.out.println("The elements of a2 are:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                System.out.println(a2[i][j]);
            }
        }
        System.out.println("The elements of a3 are:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 5; j++) {
                a3[i][j] = a1[i][j] + a2[i][j];
                System.out.println(a3[i][j]);
            }
        }
    }

}