public class ConcentricPattern {
    public static void main(String[] args) {
        int size = 9;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int layer = Math.min(Math.min(i, j), Math.min(size - 1 - i, size - 1 - j));

                if (layer == 0) {
                    if (i == 0 || i == size - 1) System.out.print((i + 1) + " ");
                    else System.out.print((i + 1) + " ");
                } else {
                    char letter = (char) ('A' + layer - 1);
                    System.out.print(letter + " ");
                }
            }
            System.out.println();
        }
    }
}