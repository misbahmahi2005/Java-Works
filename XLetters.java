
public class XLetters {

    public static void main(String[] args) {

        int n = Integer.parseInt(IO.readln());

        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (char) ('A' + i);
        }

        int halfRows = (n + 1) / 2;       // ceiling of n/2
        int totalRows = 2 * halfRows - 1; // total rows needed, no duplicate vertex

        for (int r = 0; r < totalRows; r++) {

            int i = Math.min(r, totalRows - 1 - r); // mirrors index back after the middle

            for (int k = 0; k < i; k++) {
                IO.print(" ");
            }

            IO.print(arr[i]);

            if (arr[i] != arr[n - 1 - i]) {
                for (int j = 0; j < (n - 2 * i - 2); j++) {
                    IO.print(" ");
                }
                IO.println(arr[n - 1 - i]);
            } else {
                IO.println();
            }
        }
    }
}