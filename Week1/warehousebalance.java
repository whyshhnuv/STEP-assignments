public class Problem4 {

    static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;

        int max = sectionA[0];
        String section = "Section A";
        int index = 0;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];

            if (sectionA[i] > max) {
                max = sectionA[i];
                section = "Section A";
                index = i;
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];

            if (sectionB[i] > max) {
                max = sectionB[i];
                section = "Section B";
                index = i;
            }
        }

        System.out.print("Section A Total: " + totalA);
        System.out.print(" | Section B Total: " + totalB);

        if (totalA == totalB) {
            System.out.print(" | Status: Balanced");
        } else {
            System.out.print(" | Status: Not Balanced");
        }

        System.out.println(" | Highest Quantity: " + max + " (" + section + ", Item " + (index + 1) + ")");
    }

    public static void main(String[] args) {
        int[] a = {20, 15, 30};
        int[] b = {25, 10, 30};

        analyzeInventory(a, b);
    }
}
